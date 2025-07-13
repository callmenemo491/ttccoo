package p379vh;

/* renamed from: vh.u */
/* loaded from: classes.dex */
public final class C6742u {

    /* renamed from: a */
    public final java.lang.Object f26039a;

    /* renamed from: b */
    public final mh.InterfaceC4620l<java.lang.Throwable, ch.C0985l> f26040b;

    public C6742u(java.lang.Object r1, mh.InterfaceC4620l<? super java.lang.Throwable, ch.C0985l> r2) {
            r0 = this;
            r0.<init>()
            r0.f26039a = r1
            r0.f26040b = r2
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p379vh.C6742u
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            vh.u r5 = (p379vh.C6742u) r5
            java.lang.Object r1 = r4.f26039a
            java.lang.Object r3 = r5.f26039a
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            mh.l<java.lang.Throwable, ch.l> r1 = r4.f26040b
            mh.l<java.lang.Throwable, ch.l> r5 = r5.f26040b
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Object r0 = r2.f26039a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            int r0 = r0 * 31
            mh.l<java.lang.Throwable, ch.l> r1 = r2.f26040b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "CompletedWithCancellation(result="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.Object r1 = r2.f26039a
            r0.append(r1)
            java.lang.String r1 = ", onCancellation="
            r0.append(r1)
            mh.l<java.lang.Throwable, ch.l> r1 = r2.f26040b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
