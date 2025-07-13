package p379vh;

/* renamed from: vh.c1 */
/* loaded from: classes.dex */
public final class C6690c1 extends java.util.concurrent.CancellationException {

    /* renamed from: Y */
    public final p379vh.InterfaceC6687b1 f25965Y;

    public C6690c1(java.lang.String r1, java.lang.Throwable r2, p379vh.InterfaceC6687b1 r3) {
            r0 = this;
            r0.<init>(r1)
            r0.f25965Y = r3
            if (r2 == 0) goto La
            r0.initCause(r2)
        La:
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 == r2) goto L31
            boolean r0 = r3 instanceof p379vh.C6690c1
            if (r0 == 0) goto L2f
            vh.c1 r3 = (p379vh.C6690c1) r3
            java.lang.String r0 = r3.getMessage()
            java.lang.String r1 = r2.getMessage()
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto L2f
            vh.b1 r0 = r3.f25965Y
            vh.b1 r1 = r2.f25965Y
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto L2f
            java.lang.Throwable r3 = r3.getCause()
            java.lang.Throwable r0 = r2.getCause()
            boolean r3 = p214m2.C4339q.m9702c(r3, r0)
            if (r3 == 0) goto L2f
            goto L31
        L2f:
            r3 = 0
            goto L32
        L31:
            r3 = 1
        L32:
            return r3
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
            r1 = this;
            r0 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
            r1.setStackTrace(r0)
            return r1
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.getMessage()
            p214m2.C4339q.m9704i(r0)
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            vh.b1 r1 = r2.f25965Y
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Throwable r0 = r2.getCause()
            if (r0 != 0) goto L1e
            r0 = 0
            goto L22
        L1e:
            int r0 = r0.hashCode()
        L22:
            int r1 = r1 + r0
            return r1
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "; job="
            r0.append(r1)
            vh.b1 r1 = r2.f25965Y
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
