package com.course;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.course.entity.Customer;
import com.course.repository.CustomerRepository;

import lombok.RequiredArgsConstructor;


@SpringBootApplication

public class CourseServiceMmApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseServiceMmApplication.class, args);
	}
	@Bean
	  public CommandLineRunner demo(CustomerRepository repository) {
	    return (args) -> {
	      // save a few customers
	    	List<Customer> customer=new ArrayList();
	    	customer.add( new Customer("Midge Pillinger","8997760772","mpillinger0@go.com",new Date("29/09/2024"),false,72849));
	    	customer.add( new Customer("Valentine Lockitt","1361206656","vlockitt1@unc.edu",new Date("28/12/2024"),false,355595));
	    	customer.add( new Customer("Vittorio Hambidge","4783170630","vhambidge2@bloomberg.com",new Date("11/11/2024"),false,372850));
	    	customer.add( new Customer("Babita Parkman","1556334912","bparkman3@sfgate.com",new Date("31/07/2024"),false,445544));
	    	customer.add( new Customer("Lenore Calyton","3208176593","lcalyton4@oakley.com",new Date("02/12/2024"),true,41430));
	    	customer.add( new Customer("Jordan Ben-Aharon","6991369149","jbenaharon5@baidu.com",new Date("08/12/2024"),true,219340));
	    	customer.add( new Customer("Kelvin Womersley","8455606096","kwomersley6@bing.com",new Date("10/12/2024"),true,255892));
	    	customer.add( new Customer("Kaleena Swann","9689604522","kswann7@mashable.com",new Date("08/12/2024"),false,40889));
	    	customer.add( new Customer("Rubi Ansell","7598386372","ransell8@pbs.org",new Date("09/02/2024"),true,243816));
	    	customer.add( new Customer("Estevan Plumbe","6056686596","eplumbe9@angelfire.com",new Date("10/02/2024"),true,104371));
	    	customer.add( new Customer("Albrecht Tattersall","6507401549","atattersalla@hao123.com",new Date("10/06/2024"),false,388836));
	    	customer.add( new Customer("Thor Etherington","5432346376","tetheringtonb@thetimes.co.uk",new Date("27/08/2024"),true,493018));
	    	customer.add( new Customer("Hubey Larvent","1695788280","hlarventc@example.com",new Date("07/04/2024"),false,253913));
	    	customer.add( new Customer("Vladamir Paice","3619886964","vpaiced@over-blog.com",new Date("18/10/2024"),false,102742));
	    	customer.add( new Customer("Shep Stothert","8925205138","sstotherte@acquirethisname.com",new Date("30/07/2024"),false,375950));
	    	customer.add( new Customer("Jonah Pecht","9874863662","jpechtf@ustream.tv",new Date("21/12/2024"),false,195716));
	    	customer.add( new Customer("Bartel Cherry","6207506674","bcherryg@furl.net",new Date("11/01/2024"),true,226387));
	    	customer.add( new Customer("Annabal Lecky","4993335331","aleckyh@discovery.com",new Date("27/08/2024"),true,301521));
	    	customer.add( new Customer("Faustina Burchnall","9198363667","fburchnalli@jugem.jp",new Date("01/03/2024"),true,273086));
	    	customer.add( new Customer("Laure Bowry","1178360053","lbowryj@deliciousdays.com",new Date("24/07/2024"),false,377269));
	    	customer.add( new Customer("Siegfried Sambals","9579362383","ssambalsk@addthis.com",new Date("17/12/2024"),true,217679));
	    	customer.add( new Customer("Travis Olliffe","7289785388","tolliffel@mozilla.com",new Date("25/10/2024"),false,9578));
	    	customer.add( new Customer("Gerta Broseke","5634453368","gbrosekem@aboutads.info",new Date("19/06/2024"),false,318141));
	    	customer.add( new Customer("Shelby Myhill","2758922099","smyhilln@skyrock.com",new Date("16/07/2024"),false,352073));
	    	customer.add( new Customer("Eba Bodman","8717424058","ebodmano@printfriendly.com",new Date("13/07/2024"),false,348701));
	    	customer.add( new Customer("Dag Mc Gaughey","8479504825","dmcp@photobucket.com",new Date("25/11/2024"),true,172485));
	    	customer.add( new Customer("Enoch Berthomier","9413336583","eberthomierq@si.edu",new Date("27/06/2024"),true,436239));
	    	customer.add( new Customer("Nehemiah Wallbrook","5481244361","nwallbrookr@example.com",new Date("19/10/2024"),false,57856));
	    	customer.add( new Customer("Gaspar Hise","8783089863","ghises@hibu.com",new Date("11/01/2024"),true,164981));
	    	customer.add( new Customer("Joanie Duggary","2168035947","jduggaryt@liveinternet.ru",new Date("18/12/2024"),false,162985));
	    	customer.add( new Customer("Karlen Crosby","3354510469","kcrosbyu@mtv.com",new Date("05/01/2024"),false,236009));
	    	customer.add( new Customer("Nelie Cousins","9739052703","ncousinsv@bandcamp.com",new Date("03/05/2024"),true,7208));
	    	customer.add( new Customer("Perle Zeal","6483600084","pzealw@behance.net",new Date("07/07/2024"),false,333496));
	    	customer.add( new Customer("Carmelita Parsall","1933758350","cparsallx@ucsd.edu",new Date("27/05/2024"),false,345280));
	    	customer.add( new Customer("Salvidor MacInerney","1683225655","smacinerneyy@constantcontact.com",new Date("26/10/2024"),false,388586));
	    	customer.add( new Customer("Cassie Redmille","4613708766","credmillez@goo.gl",new Date("18/02/2024"),false,420629));
	    	customer.add( new Customer("Janice Wye","7794873775","jwye10@altervista.org",new Date("05/07/2024"),false,150116));
	    	customer.add( new Customer("Marion Mounfield","7739093944","mmounfield11@mapy.cz",new Date("11/01/2024"),true,206340));
	    	customer.add( new Customer("Herbert Beeston","8316991356","hbeeston12@deviantart.com",new Date("24/10/2024"),true,297137));
	    	customer.add( new Customer("Lyn Devall","4279251036","ldevall13@ezinearticles.com",new Date("06/10/2024"),true,14141));
	    	customer.add( new Customer("Mayer Ditt","1501270205","mditt14@sitemeter.com",new Date("02/01/2024"),false,351358));
	    	customer.add( new Customer("Rose Dubble","9154896094","rdubble15@gravatar.com",new Date("19/12/2024"),true,141866));
	    	customer.add( new Customer("Harmony Leahey","6456377344","hleahey16@hibu.com",new Date("27/07/2024"),false,261431));
	    	customer.add( new Customer("Rowen Boyford","4408816799","rboyford17@meetup.com",new Date("16/08/2024"),true,17126));
	    	customer.add( new Customer("Carlita Oaks","8644330505","coaks18@youtu.be",new Date("30/04/2024"),true,206239));
	    	customer.add( new Customer("Burg Dullard","4013854959","bdullard19@businessinsider.com",new Date("06/02/2024"),false,309521));
	    	customer.add( new Customer("Brockie Bottini","7566497068","bbottini1a@devhub.com",new Date("07/12/2024"),true,171546));
	    	customer.add( new Customer("Lolita Lickess","2516604118","llickess1b@cpanel.net",new Date("08/01/2024"),false,489852));
	    	customer.add( new Customer("Karilynn Dawtry","1434166524","kdawtry1c@ed.gov",new Date("07/02/2024"),false,99761));
	    	customer.add( new Customer("Marcie Kilner","2017710327","mkilner1d@oracle.com",new Date("12/05/2024"),false,266092));
	    	customer.add( new Customer("Brianne Tree","9007461276","btree1e@fc2.com",new Date("24/02/2024"),true,319922));
	    	customer.add( new Customer("Hymie Mangon","4379319287","hmangon1f@wiley.com",new Date("10/06/2024"),false,374684));
	    	customer.add( new Customer("Ive Martinuzzi","8054046402","imartinuzzi1g@macromedia.com",new Date("06/02/2024"),true,153569));
	    	customer.add( new Customer("Fonsie Ferrolli","9845413571","fferrolli1h@posterous.com",new Date("23/04/2024"),false,449687));
	    	customer.add( new Customer("Phelia Crumbleholme","7092683725","pcrumbleholme1i@wired.com",new Date("11/09/2024"),true,427116));
	    	customer.add( new Customer("Constanta Cristea","7682710870","ccristea1j@ucoz.com",new Date("25/08/2024"),true,169789));
	    	customer.add( new Customer("Kristal Malkin","6157180487","kmalkin1k@uol.com.br",new Date("26/10/2024"),false,434099));
	    	customer.add( new Customer("Iggie Heffy","9835754596","iheffy1l@elpais.com",new Date("16/12/2024"),false,282325));
	    	customer.add( new Customer("Nicole Simkiss","3579987599","nsimkiss1m@globo.com",new Date("02/10/2024"),true,445935));
	    	customer.add( new Customer("Olia Finkle","8844504017","ofinkle1n@chronoengine.com",new Date("27/08/2024"),false,22192));
	    	customer.add( new Customer("Budd Beirne","2337470564","bbeirne1o@slideshare.net",new Date("20/05/2024"),true,414685));
	    	customer.add( new Customer("Royce Sadd","6444772956","rsadd1p@elegantthemes.com",new Date("30/03/2024"),true,417906));
	    	customer.add( new Customer("Geralda Digance","6908654066","gdigance1q@i2i.jp",new Date("21/12/2024"),true,183969));
	    	customer.add( new Customer("Cal Tomashov","4972435569","ctomashov1r@sciencedaily.com",new Date("25/10/2024"),true,285462));
	    	customer.add( new Customer("Zedekiah Chasteau","9659327780","zchasteau1s@ocn.ne.jp",new Date("10/12/2024"),false,411345));
	    	customer.add( new Customer("Irina Christer","9031361911","ichrister1t@woothemes.com",new Date("20/01/2024"),false,454819));
	    	customer.add( new Customer("Bendite Brizell","5921048521","bbrizell1u@ftc.gov",new Date("12/12/2024"),false,436638));
	    	customer.add( new Customer("Renado Strother","6522029601","rstrother1v@google.fr",new Date("06/04/2024"),true,275971));
	    	customer.add( new Customer("Aurelie Elmhurst","4805384612","aelmhurst1w@blogger.com",new Date("24/11/2024"),false,426681));
	    	customer.add( new Customer("Jayme Curzey","2827938002","jcurzey1x@accuweather.com",new Date("17/03/2024"),false,275091));
	    	customer.add( new Customer("Caesar De Dantesie","7121758113","cde1y@salon.com",new Date("22/09/2024"),true,255726));
	    	customer.add( new Customer("Lambert Byway","6856287521","lbyway1z@canalblog.com",new Date("09/09/2024"),false,78916));
	    	customer.add( new Customer("Dorry Usherwood","2235918640","dusherwood20@webnode.com",new Date("24/09/2024"),true,123425));
	    	customer.add( new Customer("Justinian Merryweather","3232526849","jmerryweather21@amazon.co.uk",new Date("07/07/2024"),true,21470));
	    	customer.add( new Customer("Ned Gramer","5889861214","ngramer22@nymag.com",new Date("20/10/2024"),false,246988));
	    	customer.add( new Customer("Westleigh Rembrant","4411539362","wrembrant23@weebly.com",new Date("04/07/2024"),false,89081));
	    	customer.add( new Customer("Bree Nyssen","6667946680","bnyssen24@toplist.cz",new Date("06/11/2024"),false,378777));
	    	customer.add( new Customer("Jock Tremayle","7862245024","jtremayle25@prnewswire.com",new Date("01/07/2024"),true,390940));
	    	customer.add( new Customer("Tyne Martinovsky","9293197010","tmartinovsky26@friendfeed.com",new Date("26/04/2024"),false,194604));
	    	customer.add( new Customer("Flss Gauthorpp","1883707726","fgauthorpp27@google.co.uk",new Date("04/03/2024"),true,246584));
	    	customer.add( new Customer("Stella Crisp","5897635257","scrisp28@bandcamp.com",new Date("26/10/2024"),false,225569));
	    	customer.add( new Customer("Gerhard Pickersgill","4159572290","gpickersgill29@hp.com",new Date("28/10/2024"),false,361579));
	    	customer.add( new Customer("Ade Shah","8336502013","ashah2a@g.co",new Date("27/07/2024"),true,350483));
	    	customer.add( new Customer("Scarlett Twidle","5043928274","stwidle2b@livejournal.com",new Date("30/06/2024"),true,137691));
	    	customer.add( new Customer("Geralda Kingscote","2806540170","gkingscote2c@slideshare.net",new Date("10/06/2024"),false,415224));
	    	customer.add( new Customer("Kassie Gorstidge","6355720745","kgorstidge2d@php.net",new Date("08/10/2024"),true,320423));
	    	customer.add( new Customer("Kristos Bark","8018402650","kbark2e@furl.net",new Date("27/05/2024"),true,70140));
	    	customer.add( new Customer("Keefe Sheppard","8157026251","ksheppard2f@hud.gov",new Date("05/04/2024"),true,175012));
	    	customer.add( new Customer("Lefty Lorrain","6726771817","llorrain2g@1und1.de",new Date("13/09/2024"),true,273801));
	    	customer.add( new Customer("Jeanette Danielou","8772154476","jdanielou2h@arstechnica.com",new Date("17/04/2024"),false,237078));
	    	customer.add( new Customer("Aguie Mallaby","9957978183","amallaby2i@shop-pro.jp",new Date("22/07/2024"),false,444176));
	    	customer.add( new Customer("Christophe Constable","2403687074","cconstable2j@paypal.com",new Date("15/02/2024"),false,86256));
	    	customer.add( new Customer("Stacie Tonkinson","8937934839","stonkinson2k@jiathis.com",new Date("18/12/2024"),false,365754));
	    	customer.add( new Customer("Giorgio Espy","8266061228","gespy2l@vinaora.com",new Date("22/02/2024"),true,52465));
	    	customer.add( new Customer("Anabelle Carlson","8666951048","acarlson2m@parallels.com",new Date("10/10/2024"),false,442385));
	    	customer.add( new Customer("Gunther Livick","4891489389","glivick2n@japanpost.jp",new Date("08/06/2024"),true,273459));
	    	customer.add( new Customer("Druci Kirkbright","5323504664","dkirkbright2o@ted.com",new Date("23/04/2024"),true,171673));
	    	customer.add( new Customer("Prinz Bradneck","2029910804","pbradneck2p@blog.com",new Date("06/11/2024"),false,327206));
	    	customer.add( new Customer("Gretta ducarme","3122644198","gducarme2q@seesaa.net",new Date("17/10/2024"),false,436508));
	    	customer.add( new Customer("Virgie Pearsey","1869329499","vpearsey2r@businesswire.com",new Date("02/08/2024"),false,366314));
	    	customer.add( new Customer("Joan Leeburne","1015163542","jleeburne2s@e-recht24.de",new Date("11/12/2024"),false,366587));
	    	customer.add( new Customer("Emmeline Jellico","5612311369","ejellico2t@theguardian.com",new Date("07/11/2024"),true,495501));
	    	customer.add( new Customer("Micki Straun","1663926595","mstraun2u@aol.com",new Date("26/06/2024"),false,56156));
	    	customer.add( new Customer("Ruthe Cockshutt","5341116891","rcockshutt2v@etsy.com",new Date("24/02/2024"),false,39973));
	    	customer.add( new Customer("Lucilia Westmancoat","8008423334","lwestmancoat2w@nydailynews.com",new Date("28/12/2024"),true,148993));
	    	customer.add( new Customer("Judie Kilvington","3132198678","jkilvington2x@xing.com",new Date("03/05/2024"),false,274525));
	    	customer.add( new Customer("Buck Hawler","4724912650","bhawler2y@mail.ru",new Date("30/11/2024"),true,216396));
	    	customer.add( new Customer("Ruy Pawlett","9739765414","rpawlett2z@weibo.com",new Date("01/03/2024"),false,112381));
	    	customer.add( new Customer("Rustin Rawcliffe","5846093688","rrawcliffe30@walmart.com",new Date("11/03/2024"),true,27151));
	    	customer.add( new Customer("Dinny de Aguirre","2465513489","dde31@etsy.com",new Date("20/05/2024"),false,390768));
	    	customer.add( new Customer("Barclay Drakard","1516303913","bdrakard32@china.com.cn",new Date("22/01/2024"),false,134765));
	    	customer.add( new Customer("Jerrome Tellenbroker","3599183421","jtellenbroker33@jugem.jp",new Date("21/11/2024"),true,417631));
	    	customer.add( new Customer("Maurene Perkin","4501814101","mperkin34@google.com.au",new Date("07/07/2024"),true,337414));
	    	customer.add( new Customer("Collen Nicholl","6757972384","cnicholl35@sbwire.com",new Date("28/06/2024"),false,140850));
	    	customer.add( new Customer("Ingaborg Hudel","2865686953","ihudel36@hp.com",new Date("02/05/2024"),false,360580));
	    	customer.add( new Customer("Ginger Hegley","2167438493","ghegley37@networksolutions.com",new Date("26/02/2024"),false,212215));
	    	customer.add( new Customer("Chaim Arrighini","3827765757","carrighini38@parallels.com",new Date("08/12/2024"),false,277463));
	    	customer.add( new Customer("Denys Alanbrooke","4247169705","dalanbrooke39@about.me",new Date("18/10/2024"),true,480081));
	    	customer.add( new Customer("Ede Diffley","8111083956","ediffley3a@canalblog.com",new Date("25/01/2024"),true,422541));
	    	customer.add( new Customer("Leslie O' Mara","8343387676","lo3b@yandex.ru",new Date("27/02/2024"),true,200085));
	    	customer.add( new Customer("Dani Godley","7647666528","dgodley3c@histats.com",new Date("03/11/2024"),false,441706));
	    	customer.add( new Customer("Celesta Methuen","3668855419","cmethuen3d@timesonline.co.uk",new Date("01/07/2024"),false,144178));
	    	customer.add( new Customer("Geoffry Kelinge","1275794182","gkelinge3e@dell.com",new Date("01/11/2024"),false,190605));
	    	customer.add( new Customer("Emili Brightwell","4277823011","ebrightwell3f@altervista.org",new Date("05/06/2024"),true,463832));
	    	customer.add( new Customer("Iorgo Beauchop","2313950047","ibeauchop3g@t.co",new Date("11/04/2024"),false,439569));
	    	customer.add( new Customer("Claudina Hampshaw","6405020764","champshaw3h@google.ca",new Date("18/03/2024"),true,24806));
	    	customer.add( new Customer("Sigismund Lalor","8119152336","slalor3i@statcounter.com",new Date("03/12/2024"),true,322533));
	    	customer.add( new Customer("Nappie Crock","3288302059","ncrock3j@delicious.com",new Date("04/09/2024"),true,329558));
	    	customer.add( new Customer("Cozmo Dunk","9838855024","cdunk3k@mysql.com",new Date("06/01/2024"),false,22939));
	    	customer.add( new Customer("Cary Castellanos","7234078942","ccastellanos3l@themeforest.net",new Date("21/10/2024"),false,273756));
	    	customer.add( new Customer("Hildegarde Cardenosa","8095491855","hcardenosa3m@godaddy.com",new Date("03/01/2024"),false,228354));
	    	customer.add( new Customer("Demetra Iredale","7726246272","diredale3n@indiegogo.com",new Date("23/08/2024"),false,433471));
	    	customer.add( new Customer("Agnola Maude","7002679852","amaude3o@geocities.jp",new Date("20/11/2024"),true,333337));
	    	customer.add( new Customer("Leena Browne","8415423213","lbrowne3p@mail.ru",new Date("06/03/2024"),false,161258));
	    	customer.add( new Customer("Fern Veschi","6868561314","fveschi3q@blogtalkradio.com",new Date("21/09/2024"),false,208104));
	    	customer.add( new Customer("Francklin Pauley","2339854387","fpauley3r@de.vu",new Date("01/09/2024"),false,23977));
	    	customer.add( new Customer("Dana Pack","8705869667","dpack3s@independent.co.uk",new Date("28/07/2024"),false,308148));
	    	customer.add( new Customer("Marquita Kach","7563035667","mkach3t@shutterfly.com",new Date("08/10/2024"),true,79403));
	    	customer.add( new Customer("Adoree Vynarde","5332083760","avynarde3u@si.edu",new Date("29/04/2024"),true,10800));
	    	customer.add( new Customer("Belva Bodd","8327896134","bbodd3v@delicious.com",new Date("12/05/2024"),false,423112));
	    	customer.add( new Customer("Kassi Virgoe","3898404494","kvirgoe3w@tripod.com",new Date("04/04/2024"),false,132549));
	    	customer.add( new Customer("Franni Lent","5233248319","flent3x@cnbc.com",new Date("09/05/2024"),false,254979));
	    	customer.add( new Customer("Agata Debill","2787900155","adebill3y@ocn.ne.jp",new Date("12/10/2024"),false,478855));
	    	customer.add( new Customer("Glennie Yeandel","1755984154","gyeandel3z@senate.gov",new Date("02/11/2024"),true,36548));
	    	customer.add( new Customer("Sallyanne Craine","7216058825","scraine40@umn.edu",new Date("22/10/2024"),true,458498));
	    	customer.add( new Customer("Carmencita Freegard","7815636751","cfreegard41@businessweek.com",new Date("12/05/2024"),true,251465));
	    	customer.add( new Customer("Arleyne Towe","9341028365","atowe42@blinklist.com",new Date("10/11/2024"),true,238510));
	    	customer.add( new Customer("Elvera Reveley","8824867239","ereveley43@etsy.com",new Date("19/04/2024"),false,289798));
	    	customer.add( new Customer("Nikola Dannehl","5991184929","ndannehl44@harvard.edu",new Date("09/02/2024"),true,201223));
	    	customer.add( new Customer("Gregorio Foddy","9686524191","gfoddy45@umich.edu",new Date("02/02/2024"),false,245417));
	    	repository.saveAll(customer
		    		 
		    		
		    		  );
	     
	      
	      
	    };
	 }

}
