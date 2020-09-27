package space.ifel.engine;

import org.joml.Vector2d;
import org.joml.Vector2f;

import static org.lwjgl.glfw.GLFW.glfwSetCursorEnterCallback;
import static org.lwjgl.glfw.GLFW.glfwSetCursorPosCallback;

public class KeyboardInput {
    private final Vector2d previousPos;

    private final Vector2d currentPos;

    private final Vector2f displVec;

    private boolean inWindow = false;

    private boolean leftButtonPressed = false;

    private boolean rightButtonPressed = false;

    private boolean forwardButtonPressed = false;

    private boolean backwardButtonPressed = false;

    public KeyboardInput() {
        previousPos = new Vector2d(-1, -1);
        currentPos = new Vector2d(0, 0);
        displVec = new Vector2f();
    }

    public void init(Window window) {
        glfwSetCursorPosCallback(window.getWindowHandle(), (windowHandle, xpos, ypos) -> {
            currentPos.x = xpos;
            currentPos.y = ypos;
        });
        glfwSetCursorEnterCallback(window.getWindowHandle(), (windowHandle, entered) -> {
            inWindow = entered;
        });
//        glfwSetKeyCallback(window.getWindowHandle(), (windowHandle, pressed) -> {
//            leftButtonPressed = Keyboard.;
//            rightButtonPressed = '';
//            forwardButtonPressed = '';
//            backwardButtonPressed = '';
//            boolean keyDown = Keyboard.isKeyDown(Keyboard.KEY_X);
//        });

    }

    public Vector2f getDisplVec() {
        return displVec;
    }

    public Vector2d getCurrentPos() {
        return currentPos;
    }

    public void input(Window window) {
        displVec.x = 0;
        displVec.y = 0;
        if (previousPos.x > 0 && previousPos.y > 0 && inWindow) {
            double deltax = currentPos.x - previousPos.x;
            double deltay = currentPos.y - previousPos.y;
            boolean rotateX = deltax != 0;
            boolean rotateY = deltay != 0;
            if (rotateX) {
                displVec.y = (float) deltax;
            }
            if (rotateY) {
                displVec.x = (float) deltay;
            }
        }
        previousPos.x = currentPos.x;
        previousPos.y = currentPos.y;
    }

    public boolean isLeftButtonPressed() {
        return leftButtonPressed;
    }

    public boolean isRightButtonPressed() {
        return rightButtonPressed;
    }
    public boolean isForwardButtonPressed() {
        return leftButtonPressed;
    }

    public boolean isBackwardButtonPressed() {
        return rightButtonPressed;
    }
}
