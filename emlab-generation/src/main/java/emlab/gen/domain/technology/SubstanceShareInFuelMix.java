/*******************************************************************************
 * Copyright 2012 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package emlab.gen.domain.technology;

import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;
import org.neo4j.graphdb.Direction;

@NodeEntity
public class SubstanceShareInFuelMix {

    private double share;

    @RelatedTo(type = "SUBSTANCE", elementClass = Substance.class, direction = Direction.OUTGOING)
    private Substance substance;

    public double getShare() {
        return share;
    }

    public void setShare(double share) {
        this.share = share;
    }

    public Substance getSubstance() {
        return substance;
    }

    public void setSubstance(Substance substance) {
        this.substance = substance;
    }
    
    public String toString(){
    	return this.substance + ": "+ this.share;
    }
}
