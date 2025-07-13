package p071e6;

/* renamed from: e6.p */
/* loaded from: classes.dex */
public final /* synthetic */ class C1541p implements p327s7.InterfaceC5981e {

    /* renamed from: Y */
    public final java.lang.Object f7463Y;

    /* renamed from: Z */
    public long f7464Z;

    public /* synthetic */ C1541p(p071e6.C1542q r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.f7463Y = r1
            r0.f7464Z = r2
            return
    }

    public C1541p(p353u6.InterfaceC6340c r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f7463Y = r2
            return
    }

    @Override // p327s7.InterfaceC5981e
    /* renamed from: c */
    public void mo4109c(java.lang.Exception r6) {
            r5 = this;
            java.lang.Object r0 = r5.f7463Y
            e6.q r0 = (p071e6.C1542q) r0
            long r1 = r5.f7464Z
            boolean r3 = r6 instanceof p201l6.C4182b
            if (r3 == 0) goto L11
            l6.b r6 = (p201l6.C4182b) r6
            com.google.android.gms.common.api.Status r6 = r6.f17345Y
            int r6 = r6.f5536Z
            goto L13
        L11:
            r6 = 13
        L13:
            com.google.android.gms.cast.framework.media.b r0 = r0.f7467c
            h6.n r0 = r0.f5490c
            java.util.List<h6.q> r0 = r0.f11335d
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r0.next()
            h6.q r3 = (p123h6.C2510q) r3
            r4 = 0
            r3.m6410b(r1, r6, r4)
            goto L1d
        L2e:
            return
    }
}
