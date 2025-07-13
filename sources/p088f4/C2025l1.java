package p088f4;

/* renamed from: f4.l1 */
/* loaded from: classes.dex */
public final class C2025l1 {

    /* renamed from: a */
    public final android.content.Context f9188a;

    /* renamed from: b */
    public final android.os.Handler f9189b;

    /* renamed from: c */
    public final p088f4.C2025l1.b f9190c;

    /* renamed from: d */
    public final android.media.AudioManager f9191d;

    /* renamed from: e */
    public p088f4.C2025l1.c f9192e;

    /* renamed from: f */
    public int f9193f;

    /* renamed from: g */
    public int f9194g;

    /* renamed from: h */
    public boolean f9195h;

    /* renamed from: f4.l1$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: f4.l1$b */
    public interface b {
    }

    /* renamed from: f4.l1$c */
    public final class c extends android.content.BroadcastReceiver {

        /* renamed from: b */
        public static final /* synthetic */ int f9196b = 0;

        /* renamed from: a */
        public final /* synthetic */ p088f4.C2025l1 f9197a;

        public c(p088f4.C2025l1 r1, p088f4.C2025l1.a r2) {
                r0 = this;
                r0.f9197a = r1
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r2, android.content.Intent r3) {
                r1 = this;
                f4.l1 r2 = r1.f9197a
                android.os.Handler r3 = r2.f9189b
                f1.f r0 = new f1.f
                r0.<init>(r2)
                r3.post(r0)
                return
        }
    }

    public C2025l1(android.content.Context r2, android.os.Handler r3, p088f4.C2025l1.b r4) {
            r1 = this;
            r1.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            r1.f9188a = r2
            r1.f9189b = r3
            r1.f9190c = r4
            java.lang.String r3 = "audio"
            java.lang.Object r3 = r2.getSystemService(r3)
            android.media.AudioManager r3 = (android.media.AudioManager) r3
            p371v5.C6549a.m13292f(r3)
            r1.f9191d = r3
            r4 = 3
            r1.f9193f = r4
            int r4 = m5328b(r3, r4)
            r1.f9194g = r4
            int r4 = r1.f9193f
            boolean r3 = m5327a(r3, r4)
            r1.f9195h = r3
            f4.l1$c r3 = new f4.l1$c
            r4 = 0
            r3.<init>(r1, r4)
            android.content.IntentFilter r4 = new android.content.IntentFilter
            java.lang.String r0 = "android.media.VOLUME_CHANGED_ACTION"
            r4.<init>(r0)
            r2.registerReceiver(r3, r4)     // Catch: java.lang.RuntimeException -> L3e
            r1.f9192e = r3     // Catch: java.lang.RuntimeException -> L3e
            goto L46
        L3e:
            r2 = move-exception
            java.lang.String r3 = "StreamVolumeManager"
            java.lang.String r4 = "Error registering stream volume receiver"
            p371v5.C6565o.m13370c(r3, r4, r2)
        L46:
            return
    }

    /* renamed from: a */
    public static boolean m5327a(android.media.AudioManager r2, int r3) {
            int r0 = p371v5.C6552b0.f25624a
            r1 = 23
            if (r0 < r1) goto Lb
            boolean r2 = r2.isStreamMute(r3)
            return r2
        Lb:
            int r2 = m5328b(r2, r3)
            if (r2 != 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            return r2
    }

    /* renamed from: b */
    public static int m5328b(android.media.AudioManager r3, int r4) {
            int r3 = r3.getStreamVolume(r4)     // Catch: java.lang.RuntimeException -> L5
            return r3
        L5:
            r0 = move-exception
            r1 = 60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Could not retrieve stream volume for stream type "
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "StreamVolumeManager"
            p371v5.C6565o.m13370c(r2, r1, r0)
            int r3 = r3.getStreamMaxVolume(r4)
            return r3
    }

    /* renamed from: c */
    public void m5329c(int r3) {
            r2 = this;
            int r0 = r2.f9193f
            if (r0 != r3) goto L5
            return
        L5:
            r2.f9193f = r3
            r2.m5330d()
            f4.l1$b r3 = r2.f9190c
            f4.j1$b r3 = (p088f4.C2019j1.b) r3
            f4.j1 r0 = r3.f9074Y
            f4.l1 r0 = r0.f9058k
            f4.o r0 = p088f4.C2019j1.m5270i0(r0)
            f4.j1 r1 = r3.f9074Y
            f4.o r1 = r1.f9048D
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L3a
            f4.j1 r3 = r3.f9074Y
            r3.f9048D = r0
            java.util.concurrent.CopyOnWriteArraySet<f4.x0$e> r3 = r3.f9054g
            java.util.Iterator r3 = r3.iterator()
        L2a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r3.next()
            f4.x0$e r1 = (p088f4.InterfaceC2054x0.e) r1
            r1.mo2886M(r0)
            goto L2a
        L3a:
            return
    }

    /* renamed from: d */
    public final void m5330d() {
            r4 = this;
            android.media.AudioManager r0 = r4.f9191d
            int r1 = r4.f9193f
            int r0 = m5328b(r0, r1)
            android.media.AudioManager r1 = r4.f9191d
            int r2 = r4.f9193f
            boolean r1 = m5327a(r1, r2)
            int r2 = r4.f9194g
            if (r2 != r0) goto L18
            boolean r2 = r4.f9195h
            if (r2 == r1) goto L38
        L18:
            r4.f9194g = r0
            r4.f9195h = r1
            f4.l1$b r2 = r4.f9190c
            f4.j1$b r2 = (p088f4.C2019j1.b) r2
            f4.j1 r2 = r2.f9074Y
            java.util.concurrent.CopyOnWriteArraySet<f4.x0$e> r2 = r2.f9054g
            java.util.Iterator r2 = r2.iterator()
        L28:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L38
            java.lang.Object r3 = r2.next()
            f4.x0$e r3 = (p088f4.InterfaceC2054x0.e) r3
            r3.mo2908i0(r0, r1)
            goto L28
        L38:
            return
    }
}
