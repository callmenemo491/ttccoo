package p041ce;

/* renamed from: ce.f */
/* loaded from: classes.dex */
public final class C0955f implements java.io.Serializable {

    /* renamed from: Y */
    public final java.lang.String f4952Y;

    /* renamed from: Z */
    public final java.lang.String f4953Z;

    /* renamed from: a0 */
    public final java.lang.String f4954a0;

    /* renamed from: b0 */
    public final java.lang.String f4955b0;

    /* renamed from: c0 */
    public final java.lang.String f4956c0;

    /* renamed from: d0 */
    public final java.lang.String f4957d0;

    /* renamed from: e0 */
    public final java.lang.String f4958e0;

    public C0955f(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r1 = this;
            java.lang.String r0 = "url"
            p214m2.C4339q.m9706k(r8, r0)
            r1.<init>()
            r1.f4952Y = r2
            r1.f4953Z = r3
            r1.f4954a0 = r4
            r1.f4955b0 = r5
            r1.f4956c0 = r6
            r1.f4957d0 = r7
            r1.f4958e0 = r8
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p041ce.C0955f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ce.f r5 = (p041ce.C0955f) r5
            java.lang.String r1 = r4.f4952Y
            java.lang.String r3 = r5.f4952Y
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f4953Z
            java.lang.String r3 = r5.f4953Z
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.f4954a0
            java.lang.String r3 = r5.f4954a0
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.f4955b0
            java.lang.String r3 = r5.f4955b0
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.f4956c0
            java.lang.String r3 = r5.f4956c0
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.String r1 = r4.f4957d0
            java.lang.String r3 = r5.f4957d0
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            java.lang.String r1 = r4.f4958e0
            java.lang.String r5 = r5.f4958e0
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L59
            return r2
        L59:
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f4952Y
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.f4953Z
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.f4954a0
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.f4955b0
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.f4956c0
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.f4957d0
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.f4958e0
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "TransferRequest(amount="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f4952Y
            r0.append(r1)
            java.lang.String r1 = ", currency="
            r0.append(r1)
            java.lang.String r1 = r3.f4953Z
            r0.append(r1)
            java.lang.String r1 = ", contract="
            r0.append(r1)
            java.lang.String r1 = r3.f4954a0
            r0.append(r1)
            java.lang.String r1 = ", to="
            r0.append(r1)
            java.lang.String r1 = r3.f4955b0
            r0.append(r1)
            java.lang.String r1 = ", from="
            r0.append(r1)
            java.lang.String r1 = r3.f4956c0
            r0.append(r1)
            java.lang.String r1 = ", memo="
            r0.append(r1)
            java.lang.String r1 = r3.f4957d0
            r0.append(r1)
            java.lang.String r1 = ", url="
            r0.append(r1)
            java.lang.String r1 = r3.f4958e0
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
