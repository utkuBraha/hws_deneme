package hws;



public class ChargingStationAdapter extends RecyclerView.Adapter<ChargingStationViewHolder> {

    private List<ChargingStation> chargingStations;

    public ChargingStationAdapter(List<ChargingStation> chargingStations) {
        this.chargingStations = chargingStations;
    }

    @NonNull
    @Override
    public ChargingStationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.charging_station_item, parent, false);
        return new ChargingStationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChargingStationViewHolder holder, int position) {
        ChargingStation chargingStation = chargingStations.get(position);
        holder.bind(chargingStation);
    }

    @Override
    public int getItemCount() {
        return chargingStations.size();
    }
}

public class ChargingStationViewHolder<TextView> extends RecyclerView.ViewHolder {

    private TextView nameTextView;
    private TextView addressTextView;
    private Button playButton;

    public ChargingStationViewHolder(View itemView) {
        super(itemView);
        nameTextView = itemView.findViewById(R.id.name_text_view);
        addressTextView = itemView.findViewById(R.id.address_text_view);
        playButton = itemView.findViewById(R.id.play_button);
    }

    public void bind(ChargingStation chargingStation) {
        nameTextView.setText(chargingStation.getName());
        addressTextView.setText(chargingStation.getAddress());
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}

