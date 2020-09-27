package space.ifel.engine.graph.animation;

import space.ifel.engine.graph.Mesh;
import space.ifel.engine.items.GameItem;

import java.util.Map;
import java.util.Optional;

public class AnimatedGameItem extends GameItem {

    private Map<String, Animation> animations;

    private Animation currentAnimation;

    public AnimatedGameItem(Mesh[] meshes, Map<String, Animation> animations) {
        super(meshes);
        this.animations = animations;
        Optional<Map.Entry<String, Animation>> entry = animations.entrySet().stream().findFirst();
        currentAnimation = entry.isPresent() ? entry.get().getValue() : null;
    }

    public Animation getAnimation(String name) {
        return animations.get(name);
    }

    public Animation getCurrentAnimation() {
        return currentAnimation;
    }

    public void setCurrentAnimation(Animation currentAnimation) {
        this.currentAnimation = currentAnimation;
    }
}
