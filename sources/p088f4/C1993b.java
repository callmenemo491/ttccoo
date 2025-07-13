package p088f4;

/* renamed from: f4.b */
/* loaded from: classes.dex */
public final class C1993b {

    /* renamed from: a */
    public final android.content.Context f8786a;

    /* renamed from: b */
    public final p088f4.C1993b.a f8787b;

    /* renamed from: c */
    public boolean f8788c;

    /* renamed from: f4.b$a */
    public final class a extends android.content.BroadcastReceiver implements java.lang.Runnable {

        /* renamed from: Y */
        public final p088f4.C1993b.b f8789Y;

        /* renamed from: Z */
        public final android.os.Handler f8790Z;

        /* renamed from: a0 */
        public final /* synthetic */ p088f4.C1993b f8791a0;

        public a(p088f4.C1993b r1, android.os.Handler r2, p088f4.C1993b.b r3) {
                r0 = this;
                r0.f8791a0 = r1
                r0.<init>()
                r0.f8790Z = r2
                r0.f8789Y = r3
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r1, android.content.Intent r2) {
                r0 = this;
                java.lang.String r1 = r2.getAction()
                java.lang.String r2 = "android.media.AUDIO_BECOMING_NOISY"
                boolean r1 = r2.equals(r1)
                if (r1 == 0) goto L11
                android.os.Handler r1 = r0.f8790Z
                r1.post(r0)
            L11:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                f4.b r0 = r4.f8791a0
                boolean r0 = r0.f8788c
                if (r0 == 0) goto L12
                f4.b$b r0 = r4.f8789Y
                f4.j1$b r0 = (p088f4.C2019j1.b) r0
                f4.j1 r0 = r0.f9074Y
                r1 = 0
                r2 = -1
                r3 = 3
                r0.m5276m0(r1, r2, r3)
            L12:
                return
        }
    }

    /* renamed from: f4.b$b */
    public interface b {
    }

    public C1993b(android.content.Context r1, android.os.Handler r2, p088f4.C1993b.b r3) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.f8786a = r1
            f4.b$a r1 = new f4.b$a
            r1.<init>(r0, r2, r3)
            r0.f8787b = r1
            return
    }

    /* renamed from: a */
    public void m5109a(boolean r4) {
            r3 = this;
            if (r4 == 0) goto L18
            boolean r0 = r3.f8788c
            if (r0 != 0) goto L18
            android.content.Context r4 = r3.f8786a
            f4.b$a r0 = r3.f8787b
            android.content.IntentFilter r1 = new android.content.IntentFilter
            java.lang.String r2 = "android.media.AUDIO_BECOMING_NOISY"
            r1.<init>(r2)
            r4.registerReceiver(r0, r1)
            r4 = 1
        L15:
            r3.f8788c = r4
            goto L27
        L18:
            if (r4 != 0) goto L27
            boolean r4 = r3.f8788c
            if (r4 == 0) goto L27
            android.content.Context r4 = r3.f8786a
            f4.b$a r0 = r3.f8787b
            r4.unregisterReceiver(r0)
            r4 = 0
            goto L15
        L27:
            return
    }
}
