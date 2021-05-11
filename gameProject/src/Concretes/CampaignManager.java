package Concretes;

import Abstracts.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {

		System.out.println(campaign.getName() + " :  Created New Campaign" );	
	}

	@Override
	public void delete(Campaign campain) {
		
		System.out.println(campain.getName() + " :  Deleted Campaign" );
	}
	
	@Override
	public void update(Campaign campaign) {
		
		System.out.println(campaign.getName() + " :  Updated Campaign" );
	}
}
