module engine {
    requires org.joml;
    requires org.lwjgl;
    requires org.lwjgl.assimp;
    requires org.lwjgl.glfw;
    requires org.lwjgl.opengl;
    requires org.lwjgl.openal;
    requires org.lwjgl.stb;
    requires java.desktop;

    exports space.ifel.engine.graph;
    exports space.ifel.engine.assimp;
    exports space.ifel.engine.items;
    exports space.ifel.engine.sound;
    exports space.ifel.engine;
    exports space.ifel.engine.graph.lights;
    exports space.ifel.engine.graph.weather;
}