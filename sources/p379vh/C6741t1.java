package p379vh;

/* renamed from: vh.t1 */
/* loaded from: classes.dex */
public final class C6741t1 extends p379vh.AbstractC6755z {

    /* renamed from: Z */
    public static final p379vh.C6741t1 f26038Z = null;

    static {
            vh.t1 r0 = new vh.t1
            r0.<init>()
            p379vh.C6741t1.f26038Z = r0
            return
    }

    public C6741t1() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p379vh.AbstractC6755z
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Dispatchers.Unconfined"
            return r0
    }

    @Override // p379vh.AbstractC6755z
    /* renamed from: x0 */
    public void mo156x0(p101fh.InterfaceC2175g r1, java.lang.Runnable r2) {
            r0 = this;
            vh.w1$a r2 = p379vh.C6750w1.f26047Y
            fh.g$a r1 = r1.get(r2)
            vh.w1 r1 = (p379vh.C6750w1) r1
            if (r1 == 0) goto Lb
            return
        Lb:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls."
            r1.<init>(r2)
            throw r1
    }
}
