package space.ifel.engine.graph.particles;

import space.ifel.engine.items.GameItem;

import java.util.List;

public interface IParticleEmitter {

    void cleanup();

    Particle getBaseParticle();

    List<GameItem> getParticles();
}
