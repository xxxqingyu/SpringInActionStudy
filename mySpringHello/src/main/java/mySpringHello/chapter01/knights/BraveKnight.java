package mySpringHello.chapter01.knights;

public class BraveKnight implements IKnight {
	
	private IQuest quest;

	public BraveKnight(IQuest quest) {
		this.quest = quest;
	}

	@Override
	public void embarkOnQuest() {
		this.quest.embark();
	}

}
