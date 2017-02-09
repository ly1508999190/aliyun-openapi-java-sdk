/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class DeleteRouteEntryRequest extends RpcAcsRequest<DeleteRouteEntryResponse> {
	
	public DeleteRouteEntryRequest() {
		super("Ecs", "2014-05-26", "DeleteRouteEntry", "ecs");
	}

	private List<NextHopList> nextHopLists;

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String routeTableId;

	private String destinationCidrBlock;

	private String nextHopId;

	private String ownerAccount;

	public List<NextHopList> getNextHopLists() {
		return this.nextHopLists;
	}

	public void setNextHopLists(List<NextHopList> nextHopLists) {
		this.nextHopLists = nextHopLists;	
		for (int i = 0; i < nextHopLists.size(); i++) {
			putQueryParameter("NextHopList." + (i + 1) + ".NextHopType" , nextHopLists.get(i).getNextHopType());
			putQueryParameter("NextHopList." + (i + 1) + ".NextHopId" , nextHopLists.get(i).getNextHopId());
		}	
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		putQueryParameter("OwnerId", ownerId);
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		putQueryParameter("ResourceOwnerId", resourceOwnerId);
	}

	public String getRouteTableId() {
		return this.routeTableId;
	}

	public void setRouteTableId(String routeTableId) {
		this.routeTableId = routeTableId;
		putQueryParameter("RouteTableId", routeTableId);
	}

	public String getDestinationCidrBlock() {
		return this.destinationCidrBlock;
	}

	public void setDestinationCidrBlock(String destinationCidrBlock) {
		this.destinationCidrBlock = destinationCidrBlock;
		putQueryParameter("DestinationCidrBlock", destinationCidrBlock);
	}

	public String getNextHopId() {
		return this.nextHopId;
	}

	public void setNextHopId(String nextHopId) {
		this.nextHopId = nextHopId;
		putQueryParameter("NextHopId", nextHopId);
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	public static class NextHopList {

		private String nextHopType;

		private String nextHopId;

		public String getNextHopType() {
			return this.nextHopType;
		}

		public void setNextHopType(String nextHopType) {
			this.nextHopType = nextHopType;
		}

		public String getNextHopId() {
			return this.nextHopId;
		}

		public void setNextHopId(String nextHopId) {
			this.nextHopId = nextHopId;
		}
	}

	@Override
	public Class<DeleteRouteEntryResponse> getResponseClass() {
		return DeleteRouteEntryResponse.class;
	}

}
