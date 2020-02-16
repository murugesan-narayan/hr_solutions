package algorithms.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakingAnagramsTest {

    @Test
    void makingAnagrams() {
        int deletions = MakingAnagrams.makingAnagrams("cde", "abc");
        assertEquals(4, deletions);
    }

    @Test
    void makingAnagrams1() {
        String s1 = "zjadbkhmquvpcedlhsarcjzfsnekawczfccjomvfirwkvbveuvvwgwdbkklmgnlorpxgdunmnjwkksoepjdwiixssigbytppioxoikcwtyggsvmigrgoadisnovlhkdsacgjpkhiinqdkdnruvhwyqrngmbozgiziqkxarikfyprdciazswxinnqaogzuoaeglcgcmrjmibqnlqmfmkpczgcnmdjddnjorqtfjesthkgvataofqqewutizendrxtlpoqatktauavwtylyodekaxuzbieuhyhwoayhkrkhrhdmfqmtwqfwpcxsmcntcwrqwpajikqctvobmduivcgleddqfslhreyntaydkqffmwgazdkuhqhltndbfqkyukmpkmswdycrukrvnbpurxhmkmprcaqykenvsgtvgvocgfxvgmqzlzoxmdrofjnqncnfkgdqersmzrhhgzhrzxrlcibirqagtnndvswbkqnlivsoubhvyygdgilzylftatxxlvzxloktldjierdfpkkyuvzuifokanhniinvzxrkcasjrwojiajcvkwfpmprzyhjjwfitwswylfqjvbrvmvswtxogohhmorvkydgwyeullmuipndbixybwojkvrwmkuykxegxicivpedergizfidbwmlrdkfpeezdihbtklobqsfhapjixmjtyxnehsvlyvqjcrcodsptmxcnmlxkxgfydsemnzxlwquzjypmrfhfcmuoxraxygvdyzqnapzxfvypundnsnswznnyenvetqiurahspirxepoacrpxghvfwigdwbjrurlntthldyihnyjqpypygkfevljrntkjmwwgreruebesznkqmzouluagfkzudkfpgexziotorxgqlqjzrxtdttlbdlxivdydhvcrmxffvmwiehjyecbyxobdzylwblzkjdbxbhcyvaibhrzovcosrpxsnlppwqzhudgxmjvjldktumhpqvjhkhczstqqjqafvgchrxsdccyyqfnhczqogsnalesxwsctbfaueuxjwxhpevwguowcjkewqwtorwhsdjojdmsbjasqxowtftvofzkxxenocuihfxqilllwnemkujdzeaplbckygxnktxtyulifwvcjzotwzyxdapqbrcazzpjsmcsjncomyqvzhrvgrvmsketbhvagklbznvicyyqwpmvyftewosqyxkzefzmsmntbjddhbwfskaqptxnhpehmqgqvhdptskubnakpwpjisaxlzmvoqcbglreuwvqpgmsvofkmuwumytaxgxlybmhmgljeibvonoketwqpunesggpmddleputxhcepfzgsnsyiqpalcgdimvxpykvpeoplstcxsiqiaostfsejyjukgrbgdxwhlnuggwdahvijmbcrvidwuxgaqkhtjfcuswaaugadbjnnmrhhakduhmwxydqhkudcsgemmfsnqfbcyilaspwbdtybyqkjknnctsqfxitnpwrqgcqatnbwibzgtlpfzfjsxzawkvlbrcrxekzaxayhdynwjfdkkmfjlffxasbtussaeradtzkyzywkdzxplcywjfwlxxetryvwrwzmxkkykgkpfheqjcoshmfgjlzdjuzasaormypwealljpdttsncgtiqgjtqgusyuhsjhjfojtzvkdoexdidyrvfcqxikpjhydqgmxuyqvtdyjhxmrdnkyunprxbiikhlapyajwsepvfaeemwhbgivvzotaxbngnpvnpgjimafrakyoifsonnkoefrbgehvteilktvwvaqvkomuvejltvzxcqykwhisnqdzmywhyoflerfbxqmqnoorgocdykvlcaloyjyyzdlfwtgtltlzhbsnqusqgpdjpqzpbxqacbfyumtghfhqgzfywyqcpunfknwommorqwrmknutsdjadobbmrfeltlyihmwwcnmahakuvdoyooddrerjkvwfgwnoijmnza";
        String s2 = "ngaacvfquugxxyeqjomftsciimruzswpaxrcswuosbmpbqgkgupbmtjxgcthvqwxnnchmwwexkwyaeiiyajmtujzwfjtvfrkvtrhrplpzjpbnajlauavojxlogglnzviuprmefbeosfcsrpulpqabnnrttdivarpribwnecexjgraxmoneqqrfhmymutnnlgymcnrgrqszhuxvimzacsflggybznqmtozycseviwvrrspbgqcijhtpntspgjbazcyduczebuyuonvudxcofxeuryjxhlzjpxmkcloffoztduphstvzrbvkafjjsjshihtkskpayovclllfeigxkbhmgrxacskkzdvtnmtmdpqocbtgjzevaljjehlgzvrazotmcnafeqtgroodpsaqgkbmtmtuimujcpvecykiofoiudnlxnbdzesutlodzkmdajhehtnwbdgxitiggmliqdclqtordaudmektxxryazxjsgrbsejkilwaeksknopbszuqwoqznqkiwdjohsarfwsmhmwwanxtntlljdmztwhpbqfjkgapeudngzjhnicccnnnsammyvdalljxtlnxgqloswxhfzjjoyyjylvzgabunmrgxggfztwrptawvjhljguktrjbskxhwrovxwdypzpeurdpckbmsxwnpfpjroqpfgkdcnbtotajmdyppbbkzxxqeozxdrmiayneorycmynydonspqcqpcitqhstbeebftftkdxydlxgzmzqddjufroybitcnxfurmndsmcvzbcandrsganotdmulhyaffuysjdkyffxgjywmpqvrdlmizhwghwnntnherrcyyahkydypvvibgujhdfonedazrjdkagiagpkgulvqgfrnbcufkksoqunhdqrfybheruklfhdlowaqzxxjjpzzloiqgbxfdglwayjhhnvwjxokwlvgcwhnksftvcaaklwlliutvrrgpftlqotsldhxxmqsq";
        int deletions = MakingAnagrams.makingAnagrams(s1, s2);
        assertEquals(1000, deletions);
    }
}