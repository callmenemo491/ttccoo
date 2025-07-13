package p317ri;

/* renamed from: ri.r */
/* loaded from: classes.dex */
public class C5909r extends java.lang.IllegalStateException {

    /* renamed from: Y */
    public final /* synthetic */ int f22734Y;

    /* renamed from: Z */
    public java.lang.Throwable f22735Z;

    public C5909r(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.f22734Y = r0
            r1.<init>(r2)
            return
    }

    public C5909r(java.lang.String r2, java.lang.Throwable r3, int r4) {
            r1 = this;
            r1.f22734Y = r4
            r0 = 1
            if (r4 == r0) goto Lb
            r1.<init>(r2)
            r1.f22735Z = r3
            return
        Lb:
            r1.<init>(r2)
            r1.f22735Z = r3
            return
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
            r1 = this;
            int r0 = r1.f22734Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L9
        L6:
            java.lang.Throwable r0 = r1.f22735Z
            return r0
        L9:
            java.lang.Throwable r0 = r1.f22735Z
            return r0
    }
}
