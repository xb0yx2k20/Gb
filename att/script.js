let playerEl = document.querySelector(".player");
let playPanel = document.createElement("video");
playPanel.src = "assets/video_sample.mp4";
playPanel.classList.add("videoBox");
let btnPanel = document.createElement("div");
btnPanel.classList.add("btnPan");
let btnPlayEl = document.createElement("div");
btnPlayEl.classList.add("btnPlay");
let btnPauseEl = document.createElement("div");
btnPauseEl.classList.add("btnPause");
let btnStopEl = document.createElement("div");
btnStopEl.classList.add("btnStop");

btnPlayEl.addEventListener("click", () => {
    playPanel.play();
});

btnPauseEl.addEventListener("click", () => {
    playPanel.pause();
});

btnStopEl.addEventListener("click", () => {
    playPanel.pause();
    playPanel.currentTime = 0;
});

let volumeInput = document.createElement("input");
volumeInput.type = "range";
volumeInput.min = 0;
volumeInput.max = 10;
volumeInput.value = 5;

playPanel.volue = 0.5;
volumeInput.addEventListener("change", (e) => {
    playPanel.volume = e.target.value / 10;
});

btnPanel.appendChild(btnPlayEl);
btnPanel.appendChild(btnPauseEl);
btnPanel.appendChild(btnStopEl);
btnPanel.appendChild(volumeInput);
playerEl.appendChild(playPanel);
playerEl.appendChild(btnPanel);