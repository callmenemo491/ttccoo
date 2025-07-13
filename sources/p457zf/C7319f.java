package p457zf;

/* renamed from: zf.f */
/* loaded from: classes.dex */
public final class C7319f extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ p457zf.C7316c f28032Z;

    public C7319f(p457zf.C7316c r1) {
            r0 = this;
            r0.f28032Z = r1
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
            zf.c r1 = r3.f28032Z
            f1.f r2 = new f1.f
            r2.<init>(r1)
            r0.post(r2)
            ch.l r0 = ch.C0985l.f5061a
            return r0
    }
}
