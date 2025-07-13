package p317ri;

/* renamed from: ri.g */
/* loaded from: classes.dex */
public class C5876g extends java.io.IOException {

    /* renamed from: Y */
    public final /* synthetic */ int f22692Y;

    /* renamed from: Z */
    public java.lang.Object f22693Z;

    public C5876g(java.lang.String r2, int r3) {
            r1 = this;
            r1.f22692Y = r3
            r0 = 3
            if (r3 == r0) goto L9
            r1.<init>(r2)
            return
        L9:
            r1.<init>(r2)
            return
    }

    public C5876g(java.lang.String r2, java.lang.Exception r3) {
            r1 = this;
            r0 = 3
            r1.f22692Y = r0
            r1.<init>(r2)
            r1.f22693Z = r3
            return
    }

    public C5876g(java.lang.String r2, java.lang.Throwable r3, int r4) {
            r1 = this;
            r1.f22692Y = r4
            r0 = 1
            if (r4 == r0) goto L14
            r0 = 2
            if (r4 == r0) goto Le
            r1.<init>(r2)
            r1.f22693Z = r3
            return
        Le:
            r1.<init>(r2)
            r1.f22693Z = r3
            return
        L14:
            r1.<init>(r2)
            r1.f22693Z = r3
            return
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
            r1 = this;
            int r0 = r1.f22692Y
            switch(r0) {
                case 0: goto L10;
                case 1: goto Lb;
                case 2: goto L6;
                default: goto L5;
            }
        L5:
            goto L15
        L6:
            java.lang.Object r0 = r1.f22693Z
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
        Lb:
            java.lang.Object r0 = r1.f22693Z
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
        L10:
            java.lang.Object r0 = r1.f22693Z
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
        L15:
            java.lang.Object r0 = r1.f22693Z
            java.lang.Exception r0 = (java.lang.Exception) r0
            return r0
    }
}
