package p013ah;

/* renamed from: ah.a */
/* loaded from: classes.dex */
public final class C0100a {

    /* renamed from: a */
    public final java.lang.String f332a;

    /* renamed from: b */
    public final java.lang.String f333b;

    /* renamed from: c */
    public final p458zg.EnumC7332d f334c;

    public C0100a(java.lang.String r1, java.lang.String r2, p458zg.EnumC7332d r3) {
            r0 = this;
            r0.<init>()
            r0.f332a = r1
            r0.f333b = r2
            r0.f334c = r3
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p013ah.C0100a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ah.a r5 = (p013ah.C0100a) r5
            java.lang.String r1 = r4.f332a
            java.lang.String r3 = r5.f332a
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f333b
            java.lang.String r3 = r5.f333b
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            zg.d r1 = r4.f334c
            zg.d r5 = r5.f334c
            if (r1 == r5) goto L29
            return r2
        L29:
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f332a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.f333b
            r2 = 0
            if (r1 != 0) goto Lf
            r1 = 0
            goto L13
        Lf:
            int r1 = r1.hashCode()
        L13:
            int r0 = r0 + r1
            int r0 = r0 * 31
            zg.d r1 = r3.f334c
            if (r1 != 0) goto L1b
            goto L1f
        L1b:
            int r2 = r1.hashCode()
        L1f:
            int r0 = r0 + r2
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Message(title="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.f332a
            r0.append(r1)
            java.lang.String r1 = ", message="
            r0.append(r1)
            java.lang.String r1 = r2.f333b
            r0.append(r1)
            java.lang.String r1 = ", image="
            r0.append(r1)
            zg.d r1 = r2.f334c
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
