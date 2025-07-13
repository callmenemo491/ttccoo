package ge;

/* renamed from: ge.e */
/* loaded from: classes.dex */
public final class C2332e extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ ge.C2331d f10603Z;

    public C2332e(ge.C2331d r1) {
            r0 = this;
            r0.f10603Z = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4609a
    /* renamed from: e */
    public ch.C0985l mo15e() {
            r3 = this;
            ge.d r0 = r3.f10603Z
            r1 = 0
            r0.m1223E0(r1, r1)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            ge.d r1 = r3.f10603Z
            f1.f r2 = new f1.f
            r2.<init>(r1)
            r0.post(r2)
            ch.l r0 = ch.C0985l.f5061a
            return r0
    }
}
