package p437yf;

/* renamed from: yf.c */
/* loaded from: classes.dex */
public final class C7199c extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ p437yf.C7198b f27730Z;

    public C7199c(p437yf.C7198b r1) {
            r0 = this;
            r0.f27730Z = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4609a
    /* renamed from: e */
    public ch.C0985l mo15e() {
            r3 = this;
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            yf.b r1 = r3.f27730Z
            f1.f r2 = new f1.f
            r2.<init>(r1)
            r0.post(r2)
            ch.l r0 = ch.C0985l.f5061a
            return r0
    }
}
