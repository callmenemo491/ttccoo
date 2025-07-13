package cg;

/* renamed from: cg.i */
/* loaded from: classes.dex */
public final class C0967i extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<java.lang.Integer, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ cg.C0966h f5008Z;

    public C0967i(cg.C0966h r1) {
            r0 = this;
            r0.f5008Z = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4620l
    /* renamed from: b */
    public ch.C0985l mo107b(java.lang.Integer r2) {
            r1 = this;
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            cg.h r0 = r1.f5008Z
            T extends w1.a r0 = r0.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.x1 r0 = (p171jd.C3572x1) r0
            jd.w1 r0 = r0.f15645b
            androidx.appcompat.widget.AppCompatSeekBar r0 = r0.f15625s
            r0.setProgress(r2)
            ch.l r2 = ch.C0985l.f5061a
            return r2
    }
}
