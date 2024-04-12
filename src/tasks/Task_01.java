package src.tasks;

public class Task_01 {

//   TODO:
//    아래의 ML_REPORTING에서 검색어(KEYWORD)의 사용 시작 Indice와 종료 Indece의 값 그리고 사용된 패턴을 출력하시오.
//    출력 예시 :
//    Start index: 0, End index: 16, Used Pattern: Machine-learning
//    Start index: 520, End index: 536, Used Pattern: machine-learning
//    Start index: 750, End index: 766, Used Pattern: machine-learning
//    Start index: 1517, End index: 1533, Used Pattern: machine-learning
//    Start index: 2560, End index: 2576, Used Pattern: machine-learning
//    Start index: 3698, End index: 3714, Used Pattern: machine-learning

    private final String ML_REPORTING = "Machine-learning system based on light could yield more powerful, efficient large language models\n" +
            "MIT system demonstrates greater than 100-fold improvement in energy efficiency and a 25-fold improvement in compute density compared with current systems.\n" +
            "\n" +
            "Elizabeth A. Thomson | Materials Research Laboratory, August 22, 2023\n" +
            "\n" +
            "ChatGPT has made headlines around the world with its ability to write essays, email, and computer code based on a few prompts from a user. Now an MIT-led team reports a system that could lead to machine-learning programs several orders of magnitude more powerful than the one behind ChatGPT. The system they developed could also use several orders of magnitude less energy than the state-of-the-art supercomputers behind the machine-learning models of today. In the July 17 issue of Nature Photonics, the researchers report the first experimental demonstration of the new system, which performs its computations based on the movement of light, rather than electrons, using hundreds of micron-scale lasers. With the new system, the team reports a greater than 100-fold improvement in energy efficiency and a 25-fold improvement in compute density, a measure of the power of a system, over state-of-the-art digital computers for machine learning. \n" +
            "Toward the future\n" +
            "In the paper, the team also cites “substantially several more orders of magnitude for future improvement.” As a result, the authors continue, the technique “opens an avenue to large-scale optoelectronic processors to accelerate machine-learning tasks from data centers to decentralized edge devices.” In other words, cellphones and other small devices could become capable of running programs that can currently only be computed at large data centers.\n" +
            "Further, because the components of the system can be created using fabrication processes already in use today, “we expect that it could be scaled for commercial use in a few years. For example, the laser arrays involved are widely used in cell-phone face ID and data communication,” says Zaijun Chen, first author, who conducted the work while a postdoc at MIT in the Research Laboratory of Electronics (RLE) and is now an assistant professor at the University of Southern California.\n" +
            "Says Dirk Englund, an associate professor in MIT’s Department of Electrical Engineering and Computer Science and leader of the work, “ChatGPT is limited in its size by the power of today’s supercomputers. It’s just not economically viable to train models that are much bigger. Our new technology could make it possible to leapfrog to machine-learning models that otherwise would not be reachable in the near future.”\n" +
            "He continues, “We don’t know what capabilities the next-generation ChatGPT will have if it is 100 times more powerful, but that’s the regime of discovery that this kind of technology can allow.” Englund is also leader of MIT’s Quantum Photonics Laboratory and is affiliated with the RLE and the Materials Research Laboratory.\n" +
            "A drumbeat of progress\n" +
            "The current work is the latest achievement in a drumbeat of progress over the last few years by Englund and many of the same colleagues. For example, in 2019 an Englund team reported the theoretical work that led to the current demonstration. The first author of that paper, Ryan Hamerly, now of RLE and NTT Research Inc., is also an author of the current paper.\n" +
            "Additional coauthors of the current Nature Photonics paper are Alexander Sludds, Ronald Davis, Ian Christen, Liane Bernstein, and Lamia Ateshian, all of RLE; and Tobias Heuser, Niels Heermeier, James A. Lott, and Stephan Reitzensttein of Technische Universitat Berlin.\n" +
            "Deep neural networks (DNNs) like the one behind ChatGPT are based on huge machine-learning models that simulate how the brain processes information. However, the digital technologies behind today’s DNNs are reaching their limits even as the field of machine learning is growing";

    private final String KEYWORD = "Machine-learning";


}
