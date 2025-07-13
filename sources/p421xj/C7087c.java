package p421xj;

/* renamed from: xj.c */
/* loaded from: classes.dex */
public class C7087c extends java.lang.IllegalStateException {

    /* renamed from: Y */
    public java.lang.Throwable f27428Y;

    public C7087c(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f27428Y = r2
            return
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
            r1 = this;
            java.lang.Throwable r0 = r1.f27428Y
            return r0
    }
}
