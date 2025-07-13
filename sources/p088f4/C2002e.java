package p088f4;

/* renamed from: f4.e */
/* loaded from: classes.dex */
public final class C2002e {

    /* renamed from: a */
    public final android.media.AudioManager f8869a;

    /* renamed from: b */
    public final p088f4.C2002e.a f8870b;

    /* renamed from: c */
    public p088f4.C2002e.b f8871c;

    /* renamed from: d */
    public p121h4.C2461d f8872d;

    /* renamed from: e */
    public int f8873e;

    /* renamed from: f */
    public int f8874f;

    /* renamed from: g */
    public float f8875g;

    /* renamed from: h */
    public android.media.AudioFocusRequest f8876h;

    /* renamed from: f4.e$a */
    public class a implements android.media.AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a */
        public final android.os.Handler f8877a;

        /* renamed from: b */
        public final /* synthetic */ p088f4.C2002e f8878b;

        public a(p088f4.C2002e r1, android.os.Handler r2) {
                r0 = this;
                r0.f8878b = r1
                r0.<init>()
                r0.f8877a = r2
                return
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int r3) {
                r2 = this;
                android.os.Handler r0 = r2.f8877a
                f4.c r1 = new f4.c
                r1.<init>(r2, r3)
                r0.post(r1)
                return
        }
    }

    /* renamed from: f4.e$b */
    public interface b {
    }

    public C2002e(android.content.Context r2, android.os.Handler r3, p088f4.C2002e.b r4) {
            r1 = this;
            r1.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.f8875g = r0
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "audio"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.media.AudioManager r2 = (android.media.AudioManager) r2
            java.util.Objects.requireNonNull(r2)
            r1.f8869a = r2
            r1.f8871c = r4
            f4.e$a r2 = new f4.e$a
            r2.<init>(r1, r3)
            r1.f8870b = r2
            r2 = 0
            r1.f8873e = r2
            return
    }

    /* renamed from: a */
    public final void m5184a() {
            r2 = this;
            int r0 = r2.f8873e
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = p371v5.C6552b0.f25624a
            r1 = 26
            if (r0 < r1) goto L15
            android.media.AudioFocusRequest r0 = r2.f8876h
            if (r0 == 0) goto L1c
            android.media.AudioManager r1 = r2.f8869a
            r1.abandonAudioFocusRequest(r0)
            goto L1c
        L15:
            android.media.AudioManager r0 = r2.f8869a
            f4.e$a r1 = r2.f8870b
            r0.abandonAudioFocus(r1)
        L1c:
            r0 = 0
            r2.m5187d(r0)
            return
    }

    /* renamed from: b */
    public final void m5185b(int r4) {
            r3 = this;
            f4.e$b r0 = r3.f8871c
            if (r0 == 0) goto L15
            f4.j1$b r0 = (p088f4.C2019j1.b) r0
            f4.j1 r1 = r0.f9074Y
            boolean r1 = r1.mo2862u()
            f4.j1 r0 = r0.f9074Y
            int r2 = p088f4.C2019j1.m5271j0(r1, r4)
            r0.m5276m0(r1, r4, r2)
        L15:
            return
    }

    /* renamed from: c */
    public void m5186c(p121h4.C2461d r6) {
            r5 = this;
            h4.d r0 = r5.f8872d
            boolean r0 = p371v5.C6552b0.m13308a(r0, r6)
            if (r0 != 0) goto L45
            r5.f8872d = r6
            r0 = 0
            r1 = 1
            if (r6 != 0) goto Lf
            goto L38
        Lf:
            int r2 = r6.f11006a0
            r3 = 3
            java.lang.String r4 = "AudioFocusManager"
            switch(r2) {
                case 0: goto L2e;
                case 1: goto L33;
                case 2: goto L2c;
                case 3: goto L38;
                case 4: goto L2c;
                case 5: goto L39;
                case 6: goto L39;
                case 7: goto L39;
                case 8: goto L39;
                case 9: goto L39;
                case 10: goto L39;
                case 11: goto L28;
                case 12: goto L39;
                case 13: goto L39;
                case 14: goto L33;
                case 15: goto L17;
                case 16: goto L20;
                default: goto L17;
            }
        L17:
            r6 = 37
            java.lang.String r3 = "Unidentified audio usage: "
            java.lang.String r6 = p064e.C1490d.m4039a(r6, r3, r2)
            goto L35
        L20:
            int r6 = p371v5.C6552b0.f25624a
            r2 = 19
            if (r6 < r2) goto L2c
            r3 = 4
            goto L39
        L28:
            int r6 = r6.f11004Y
            if (r6 != r1) goto L39
        L2c:
            r3 = 2
            goto L39
        L2e:
            java.lang.String r6 = "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."
            android.util.Log.w(r4, r6)
        L33:
            r3 = 1
            goto L39
        L35:
            android.util.Log.w(r4, r6)
        L38:
            r3 = 0
        L39:
            r5.f8874f = r3
            if (r3 == r1) goto L3f
            if (r3 != 0) goto L40
        L3f:
            r0 = 1
        L40:
            java.lang.String r6 = "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."
            p371v5.C6549a.m13289c(r0, r6)
        L45:
            return
    }

    /* renamed from: d */
    public final void m5187d(int r4) {
            r3 = this;
            int r0 = r3.f8873e
            if (r0 != r4) goto L5
            return
        L5:
            r3.f8873e = r4
            r0 = 3
            if (r4 != r0) goto Le
            r4 = 1045220557(0x3e4ccccd, float:0.2)
            goto L10
        Le:
            r4 = 1065353216(0x3f800000, float:1.0)
        L10:
            float r0 = r3.f8875g
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L17
            return
        L17:
            r3.f8875g = r4
            f4.e$b r4 = r3.f8871c
            if (r4 == 0) goto L32
            f4.j1$b r4 = (p088f4.C2019j1.b) r4
            f4.j1 r4 = r4.f9074Y
            float r0 = r4.f9070w
            f4.e r1 = r4.f9057j
            float r1 = r1.f8875g
            float r0 = r0 * r1
            r1 = 1
            r2 = 2
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r4.m5274k0(r1, r2, r0)
        L32:
            return
    }

    /* renamed from: e */
    public int m5188e(boolean r6, int r7) {
            r5 = this;
            r0 = 1
            r1 = 0
            if (r7 == r0) goto Lb
            int r7 = r5.f8874f
            if (r7 == r0) goto L9
            goto Lb
        L9:
            r7 = 0
            goto Lc
        Lb:
            r7 = 1
        Lc:
            r2 = -1
            if (r7 == 0) goto L17
            r5.m5184a()
            if (r6 == 0) goto L15
            goto L16
        L15:
            r0 = -1
        L16:
            return r0
        L17:
            if (r6 == 0) goto L89
            int r6 = r5.f8873e
            if (r6 != r0) goto L1e
            goto L88
        L1e:
            int r6 = p371v5.C6552b0.f25624a
            r7 = 26
            if (r6 < r7) goto L69
            android.media.AudioFocusRequest r6 = r5.f8876h
            if (r6 == 0) goto L29
            goto L60
        L29:
            if (r6 != 0) goto L33
            android.media.AudioFocusRequest$Builder r6 = new android.media.AudioFocusRequest$Builder
            int r7 = r5.f8874f
            r6.<init>(r7)
            goto L3a
        L33:
            android.media.AudioFocusRequest$Builder r6 = new android.media.AudioFocusRequest$Builder
            android.media.AudioFocusRequest r7 = r5.f8876h
            r6.<init>(r7)
        L3a:
            h4.d r7 = r5.f8872d
            if (r7 == 0) goto L44
            int r3 = r7.f11004Y
            if (r3 != r0) goto L44
            r3 = 1
            goto L45
        L44:
            r3 = 0
        L45:
            java.util.Objects.requireNonNull(r7)
            android.media.AudioAttributes r7 = r7.m6256a()
            android.media.AudioFocusRequest$Builder r6 = r6.setAudioAttributes(r7)
            android.media.AudioFocusRequest$Builder r6 = r6.setWillPauseWhenDucked(r3)
            f4.e$a r7 = r5.f8870b
            android.media.AudioFocusRequest$Builder r6 = r6.setOnAudioFocusChangeListener(r7)
            android.media.AudioFocusRequest r6 = r6.build()
            r5.f8876h = r6
        L60:
            android.media.AudioManager r6 = r5.f8869a
            android.media.AudioFocusRequest r7 = r5.f8876h
            int r6 = r6.requestAudioFocus(r7)
            goto L7e
        L69:
            android.media.AudioManager r6 = r5.f8869a
            f4.e$a r7 = r5.f8870b
            h4.d r3 = r5.f8872d
            java.util.Objects.requireNonNull(r3)
            int r3 = r3.f11006a0
            int r3 = p371v5.C6552b0.m13327t(r3)
            int r4 = r5.f8874f
            int r6 = r6.requestAudioFocus(r7, r3, r4)
        L7e:
            if (r6 != r0) goto L84
            r5.m5187d(r0)
            goto L88
        L84:
            r5.m5187d(r1)
            r0 = -1
        L88:
            r2 = r0
        L89:
            return r2
    }
}
