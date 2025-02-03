package entity;
// Generated 9 ene 2025, 19:43:53 by Hibernate Tools 4.3.6.Final

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Stats generated by hbm2java
 */
@Entity
@Table(name = "stats", catalog = "nba")
public class Stats implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private StatsId id;
	@JsonIgnore
	@JoinColumn(name = "code")
	private Players players;
	private Float pointsPerMatch;
	private Float assistancesPerMatch;
	private Float blocksPerMatch;
	private Float reboundPerMatch;

	public Stats() {
	}

	public Stats(StatsId id, Players players) {
		this.id = id;
		this.players = players;
	}

	public Stats(StatsId id, Players players, Float pointsPerMatch, Float assistancesPerMatch, Float blocksPerMatch,
			Float reboundPerMatch) {
		this.id = id;
		this.players = players;
		this.pointsPerMatch = pointsPerMatch;
		this.assistancesPerMatch = assistancesPerMatch;
		this.blocksPerMatch = blocksPerMatch;
		this.reboundPerMatch = reboundPerMatch;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "season", column = @Column(name = "season", nullable = false, length = 5)),
			@AttributeOverride(name = "player", column = @Column(name = "player", nullable = false)) })
	public StatsId getId() {
		return this.id;
	}

	public void setId(StatsId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "player", nullable = false, insertable = false, updatable = false)
	public Players getPlayers() {
		return this.players;
	}

	public void setPlayers(Players players) {
		this.players = players;
	}

	@Column(name = "Points_per_match", precision = 12, scale = 0)
	public Float getPointsPerMatch() {
		return this.pointsPerMatch;
	}

	public void setPointsPerMatch(Float pointsPerMatch) {
		this.pointsPerMatch = pointsPerMatch;
	}

	@Column(name = "Assistances_per_match", precision = 12, scale = 0)
	public Float getAssistancesPerMatch() {
		return this.assistancesPerMatch;
	}

	public void setAssistancesPerMatch(Float assistancesPerMatch) {
		this.assistancesPerMatch = assistancesPerMatch;
	}

	@Column(name = "Blocks_per_match", precision = 12, scale = 0)
	public Float getBlocksPerMatch() {
		return this.blocksPerMatch;
	}

	public void setBlocksPerMatch(Float blocksPerMatch) {
		this.blocksPerMatch = blocksPerMatch;
	}

	@Column(name = "Rebound_per_match", precision = 12, scale = 0)
	public Float getReboundPerMatch() {
		return this.reboundPerMatch;
	}

	public void setReboundPerMatch(Float reboundPerMatch) {
		this.reboundPerMatch = reboundPerMatch;
	}

}
