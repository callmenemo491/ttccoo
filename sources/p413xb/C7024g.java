package p413xb;

/* renamed from: xb.g */
/* loaded from: classes.dex */
public final class C7024g {

    /* renamed from: a */
    public final android.content.Context f27348a;

    /* renamed from: b */
    public final android.content.BroadcastReceiver f27349b;

    /* renamed from: c */
    public boolean f27350c;

    /* renamed from: d */
    public android.os.Handler f27351d;

    /* renamed from: e */
    public java.lang.Runnable f27352e;

    /* renamed from: f */
    public boolean f27353f;

    /* renamed from: xb.g$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: xb.g$b */
    public final class b extends android.content.BroadcastReceiver {

        /* renamed from: a */
        public final /* synthetic */ p413xb.C7024g f27354a;

        public b(p413xb.C7024g r1, p413xb.C7024g.a r2) {
                r0 = this;
                r0.f27354a = r1
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r2, android.content.Intent r3) {
                r1 = this;
                java.lang.String r2 = r3.getAction()
                java.lang.String r0 = "android.intent.action.BATTERY_CHANGED"
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto L24
                r2 = -1
                java.lang.String r0 = "plugged"
                int r2 = r3.getIntExtra(r0, r2)
                if (r2 > 0) goto L17
                r2 = 1
                goto L18
            L17:
                r2 = 0
            L18:
                xb.g r3 = r1.f27354a
                android.os.Handler r3 = r3.f27351d
                h4.l r0 = new h4.l
                r0.<init>(r1, r2)
                r3.post(r0)
            L24:
                return
        }
    }

    public C7024g(android.content.Context r2, java.lang.Runnable r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f27350c = r0
            r1.f27348a = r2
            r1.f27352e = r3
            xb.g$b r2 = new xb.g$b
            r3 = 0
            r2.<init>(r1, r3)
            r1.f27349b = r2
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
            r1.f27351d = r2
            return
    }

    /* renamed from: a */
    public void m14174a() {
            r2 = this;
            android.os.Handler r0 = r2.f27351d
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            boolean r0 = r2.f27350c
            if (r0 == 0) goto L14
            android.content.Context r0 = r2.f27348a
            android.content.BroadcastReceiver r1 = r2.f27349b
            r0.unregisterReceiver(r1)
            r0 = 0
            r2.f27350c = r0
        L14:
            return
    }
}
