package ke;

/* renamed from: ke.b */
/* loaded from: classes.dex */
public final class C4098b extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ ke.C4100d f17028Z;

    public C4098b(ke.C4100d r1) {
            r0 = this;
            r0.f17028Z = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4609a
    /* renamed from: e */
    public ch.C0985l mo15e() {
            r3 = this;
            ke.d r0 = r3.f17028Z
            r1 = 0
            r0.m1223E0(r1, r1)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            ke.d r1 = r3.f17028Z
            f1.f r2 = new f1.f
            r2.<init>(r1)
            r0.post(r2)
            ch.l r0 = ch.C0985l.f5061a
            return r0
    }
}
