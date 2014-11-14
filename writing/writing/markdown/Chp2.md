# Chapter Two: the Digital Editing Process: Goals and Procedures #

The immediate goal of my work has been to produce complete, digital, diplomatic editions of Book 8 in the Venetus A and the Escorial Υ.1.1 manuscripts. Most of my work has been accomplished in collaborative teams, partners without whom the accuracy of this project would be severely diminished. In addition to assuring accuracy, the collaborative element of this project is a key factor in producing complete digital editions of the scholia in one semester. By creating diplomatic editions, we seek to represent the visual evidence in the manuscripts as accurately as possible, without making any overly presumptive judgments. There are two main textual components to the manuscripts: the main text or poetry of the *Iliad*; and the text of the scholia. In addition, there are numerous graphic elements that must be accounted for in their own distinct way. Ultimately, every mark on the manuscript should be accounted for.

[^fn19]: More will be said about new markup in subsequent chapters.

[^fn20]: For example, current TEI P5 markup can allow a user to encode information about folio sides, placement, and even quire arrangement, using the locus element, which we find superfluous. A full list of all the features TEI P5 can encode for manuscripts can be found [here][Link6]. 

[Link6]: http://www.tei-c.org/release/doc/tei-p5-doc/en/html/MS.html. 

The most obvious of our markable features is the citation of named entities. For example the name Ὀδυσσεύς would be enclosed in personal name tags, looking like this: 
	
	<persName> Ὀδυσσεύς</persName>. 

This type of markup, however, does not do enough. As of 2011, we have given personal and place names their own unique identifiers within the Homer Multitext project. These unique identifiers are cite object URNs (uniform resource name). The advantage of URN notation is that it never changes and is an incredibly reliable way to cite information. In many way they are similar to the ISBNs that refer to books. Odysseus then looks something like this in our markup: 

	<persName n="urn:cite:hmt:pers.pers118"> Ὀδυσσεύς</persName>.

The number is an arbitrary identifier, meaning only that he happened to be the one-hundred and eighteenth name we added to our master list. This system of identification is used throughout the project, meaning that Odysseus is 

	urn:cite:hmt:pers.pers118 
	
through every single manuscript the project works on. The advantage of this identification system means that we can generate a list of every occurrence of a particular individual or place in any and all editions of text. Other types of markup we include attempt to accurately reflect the physical text. In the main text and in the scholia, we include markup for abbreviations and issues of clarity. We also include markup for quotations within the scholia that will reference other works using URN notation, in this case canonical text citations. For instance the URN used to refers to the *Iliad* in general looks like this: 

	urn:cts:greekLit:tlg0012.tlg001.
	
[Link4]: http://www.homermultitext.org/hmt-digital/ict.html?urn=urn:cite:hmt:vaimg.VA012RN-0013

[^fn23]: A succinct explanation of the philosophy behind such a process of verification can be found in Borgman 2007: 70-71.  

[Link5]: http://www.homermultitext.org/hmt-digital/indices?urn=urn%3Acite%3Ahmt%3Avaimg.VA012RN-0013

[^fn24]: For more on these scholia see [Chapter Three: Scholia on Mythological Geography](#Chapter-Three:-Scholia-on-Mythological-Geography).