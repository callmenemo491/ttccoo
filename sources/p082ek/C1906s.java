package p082ek;

/* renamed from: ek.s */
/* loaded from: classes.dex */
public class C1906s extends p082ek.AbstractC1907t<java.lang.Object> {

    /* renamed from: a */
    public final /* synthetic */ p082ek.AbstractC1907t f8210a;

    public C1906s(p082ek.AbstractC1907t r1) {
            r0 = this;
            r0.f8210a = r1
            r0.<init>()
            return
    }

    @Override // p082ek.AbstractC1907t
    /* renamed from: a */
    public void mo4684a(p082ek.C1909v r5, java.lang.Object r6) {
            r4 = this;
            if (r6 != 0) goto L3
            return
        L3:
            r0 = 0
            int r1 = java.lang.reflect.Array.getLength(r6)
        L8:
            if (r0 >= r1) goto L16
            ek.t r2 = r4.f8210a
            java.lang.Object r3 = java.lang.reflect.Array.get(r6, r0)
            r2.mo4684a(r5, r3)
            int r0 = r0 + 1
            goto L8
        L16:
            return
    }
}
