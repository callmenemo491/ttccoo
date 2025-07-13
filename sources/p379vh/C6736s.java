package p379vh;

/* renamed from: vh.s */
/* loaded from: classes.dex */
public final class C6736s {

    /* renamed from: a */
    public final java.lang.Object f26028a;

    /* renamed from: b */
    public final p379vh.AbstractC6697f f26029b;

    /* renamed from: c */
    public final mh.InterfaceC4620l<java.lang.Throwable, ch.C0985l> f26030c;

    /* renamed from: d */
    public final java.lang.Object f26031d;

    /* renamed from: e */
    public final java.lang.Throwable f26032e;

    public C6736s(java.lang.Object r1, p379vh.AbstractC6697f r2, mh.InterfaceC4620l<? super java.lang.Throwable, ch.C0985l> r3, java.lang.Object r4, java.lang.Throwable r5) {
            r0 = this;
            r0.<init>()
            r0.f26028a = r1
            r0.f26029b = r2
            r0.f26030c = r3
            r0.f26031d = r4
            r0.f26032e = r5
            return
    }

    public C6736s(java.lang.Object r3, p379vh.AbstractC6697f r4, mh.InterfaceC4620l r5, java.lang.Object r6, java.lang.Throwable r7, int r8) {
            r2 = this;
            r0 = r8 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r0 = r8 & 4
            if (r0 == 0) goto Lb
            r5 = r1
        Lb:
            r0 = r8 & 8
            if (r0 == 0) goto L10
            r6 = r1
        L10:
            r8 = r8 & 16
            if (r8 == 0) goto L15
            r7 = r1
        L15:
            r2.<init>()
            r2.f26028a = r3
            r2.f26029b = r4
            r2.f26030c = r5
            r2.f26031d = r6
            r2.f26032e = r7
            return
    }

    /* renamed from: a */
    public static p379vh.C6736s m13664a(p379vh.C6736s r6, java.lang.Object r7, p379vh.AbstractC6697f r8, mh.InterfaceC4620l r9, java.lang.Object r10, java.lang.Throwable r11, int r12) {
            r7 = r12 & 1
            r9 = 0
            if (r7 == 0) goto L9
            java.lang.Object r7 = r6.f26028a
            r1 = r7
            goto La
        L9:
            r1 = r9
        La:
            r7 = r12 & 2
            if (r7 == 0) goto L10
            vh.f r8 = r6.f26029b
        L10:
            r2 = r8
            r7 = r12 & 4
            if (r7 == 0) goto L19
            mh.l<java.lang.Throwable, ch.l> r7 = r6.f26030c
            r3 = r7
            goto L1a
        L19:
            r3 = r9
        L1a:
            r7 = r12 & 8
            if (r7 == 0) goto L20
            java.lang.Object r9 = r6.f26031d
        L20:
            r4 = r9
            r7 = r12 & 16
            if (r7 == 0) goto L27
            java.lang.Throwable r11 = r6.f26032e
        L27:
            r5 = r11
            java.util.Objects.requireNonNull(r6)
            vh.s r6 = new vh.s
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p379vh.C6736s
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            vh.s r5 = (p379vh.C6736s) r5
            java.lang.Object r1 = r4.f26028a
            java.lang.Object r3 = r5.f26028a
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            vh.f r1 = r4.f26029b
            vh.f r3 = r5.f26029b
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            mh.l<java.lang.Throwable, ch.l> r1 = r4.f26030c
            mh.l<java.lang.Throwable, ch.l> r3 = r5.f26030c
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.Object r1 = r4.f26031d
            java.lang.Object r3 = r5.f26031d
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.Throwable r1 = r4.f26032e
            java.lang.Throwable r5 = r5.f26032e
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L43
            return r2
        L43:
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.Object r0 = r3.f26028a
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            vh.f r2 = r3.f26029b
            if (r2 != 0) goto L13
            r2 = 0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r0 = r0 + r2
            int r0 = r0 * 31
            mh.l<java.lang.Throwable, ch.l> r2 = r3.f26030c
            if (r2 != 0) goto L20
            r2 = 0
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Object r2 = r3.f26031d
            if (r2 != 0) goto L2d
            r2 = 0
            goto L31
        L2d:
            int r2 = r2.hashCode()
        L31:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Throwable r2 = r3.f26032e
            if (r2 != 0) goto L39
            goto L3d
        L39:
            int r1 = r2.hashCode()
        L3d:
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "CompletedContinuation(result="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.Object r1 = r2.f26028a
            r0.append(r1)
            java.lang.String r1 = ", cancelHandler="
            r0.append(r1)
            vh.f r1 = r2.f26029b
            r0.append(r1)
            java.lang.String r1 = ", onCancellation="
            r0.append(r1)
            mh.l<java.lang.Throwable, ch.l> r1 = r2.f26030c
            r0.append(r1)
            java.lang.String r1 = ", idempotentResume="
            r0.append(r1)
            java.lang.Object r1 = r2.f26031d
            r0.append(r1)
            java.lang.String r1 = ", cancelCause="
            r0.append(r1)
            java.lang.Throwable r1 = r2.f26032e
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
