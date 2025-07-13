package p085f1;

/* renamed from: f1.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C1952b implements java.util.function.Function {

    /* renamed from: b */
    public static final /* synthetic */ p085f1.C1952b f8509b = null;

    /* renamed from: c */
    public static final /* synthetic */ p085f1.C1952b f8510c = null;

    /* renamed from: d */
    public static final /* synthetic */ p085f1.C1952b f8511d = null;

    /* renamed from: a */
    public final /* synthetic */ int f8512a;

    static {
            f1.b r0 = new f1.b
            r1 = 0
            r0.<init>(r1)
            p085f1.C1952b.f8509b = r0
            f1.b r0 = new f1.b
            r1 = 1
            r0.<init>(r1)
            p085f1.C1952b.f8510c = r0
            f1.b r0 = new f1.b
            r1 = 2
            r0.<init>(r1)
            p085f1.C1952b.f8511d = r0
            return
    }

    public /* synthetic */ C1952b(int r1) {
            r0 = this;
            r0.f8512a = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f8512a
            switch(r0) {
                case 0: goto L41;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L48
        L6:
            java.lang.String r3 = (java.lang.String) r3
            java.util.Objects.requireNonNull(r3)
            r0 = -1
            int r1 = r3.hashCode()
            switch(r1) {
                case -2065577523: goto L2a;
                case 956939050: goto L1f;
                case 975975375: goto L14;
                default: goto L13;
            }
        L13:
            goto L34
        L14:
            java.lang.String r1 = "android.media.intent.category.LIVE_VIDEO"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L1d
            goto L34
        L1d:
            r0 = 2
            goto L34
        L1f:
            java.lang.String r1 = "android.media.intent.category.LIVE_AUDIO"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L28
            goto L34
        L28:
            r0 = 1
            goto L34
        L2a:
            java.lang.String r1 = "android.media.intent.category.REMOTE_PLAYBACK"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L33
            goto L34
        L33:
            r0 = 0
        L34:
            switch(r0) {
                case 0: goto L3e;
                case 1: goto L3b;
                case 2: goto L38;
                default: goto L37;
            }
        L37:
            goto L40
        L38:
            java.lang.String r3 = "android.media.route.feature.LIVE_VIDEO"
            goto L40
        L3b:
            java.lang.String r3 = "android.media.route.feature.LIVE_AUDIO"
            goto L40
        L3e:
            java.lang.String r3 = "android.media.route.feature.REMOTE_PLAYBACK"
        L40:
            return r3
        L41:
            android.media.MediaRoute2Info r3 = (android.media.MediaRoute2Info) r3
            f1.g r3 = p085f1.C1980u.m5079b(r3)
            return r3
        L48:
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ServiceInfo r3 = r3.serviceInfo
            return r3
    }
}
