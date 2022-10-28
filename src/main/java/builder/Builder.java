package builder;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2022/10/28 14:48
 */

public interface Builder {

	Builder createTyre();

	Builder createFrame();

	Builder createEngine();

	Car builder();
}