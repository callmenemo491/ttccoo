package p062dh;

/* renamed from: dh.i */
/* loaded from: classes.dex */
public class C1473i extends p062dh.C1471g {
    /* renamed from: G */
    public static final <T> T m3995G(java.util.List<? extends T> r1) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L11
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            return r1
        L11:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "List is empty."
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: H */
    public static final <T> T m3996H(java.util.List<? extends T> r1) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Ld
            r1 = 0
            goto L12
        Ld:
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
        L12:
            return r1
    }

    /* renamed from: I */
    public static final <T> T m3997I(java.util.List<? extends T> r1, int r2) {
            if (r2 < 0) goto Ld
            int r0 = p074e9.C1805a.m4527l(r1)
            if (r2 > r0) goto Ld
            java.lang.Object r1 = r1.get(r2)
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    /* renamed from: J */
    public static final <T, A extends java.lang.Appendable> A m3998J(java.lang.Iterable<? extends T> r2, A r3, java.lang.CharSequence r4, java.lang.CharSequence r5, java.lang.CharSequence r6, int r7, java.lang.CharSequence r8, mh.InterfaceC4620l<? super T, ? extends java.lang.CharSequence> r9) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "buffer"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "separator"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "prefix"
            p214m2.C4339q.m9706k(r5, r0)
            java.lang.String r0 = "postfix"
            p214m2.C4339q.m9706k(r6, r0)
            java.lang.String r0 = "truncated"
            p214m2.C4339q.m9706k(r8, r0)
            r3.append(r5)
            java.util.Iterator r2 = r2.iterator()
            r5 = 0
        L26:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r2.next()
            int r5 = r5 + 1
            r1 = 1
            if (r5 <= r1) goto L38
            r3.append(r4)
        L38:
            if (r7 < 0) goto L3c
            if (r5 > r7) goto L40
        L3c:
            p101fh.C2174f.m5713c(r3, r0, r9)
            goto L26
        L40:
            if (r7 < 0) goto L47
            if (r5 <= r7) goto L47
            r3.append(r8)
        L47:
            r3.append(r6)
            return r3
    }

    /* renamed from: K */
    public static /* synthetic */ java.lang.Appendable m3999K(java.lang.Iterable r9, java.lang.Appendable r10, java.lang.CharSequence r11, java.lang.CharSequence r12, java.lang.CharSequence r13, int r14, java.lang.CharSequence r15, mh.InterfaceC4620l r16, int r17) {
            r0 = r17 & 2
            if (r0 == 0) goto L8
            java.lang.String r0 = ", "
            r3 = r0
            goto L9
        L8:
            r3 = r11
        L9:
            r0 = r17 & 4
            java.lang.String r1 = ""
            r2 = 0
            if (r0 == 0) goto L12
            r4 = r1
            goto L13
        L12:
            r4 = r2
        L13:
            r0 = r17 & 8
            if (r0 == 0) goto L19
            r5 = r1
            goto L1a
        L19:
            r5 = r2
        L1a:
            r0 = r17 & 16
            if (r0 == 0) goto L21
            r0 = -1
            r6 = -1
            goto L22
        L21:
            r6 = r14
        L22:
            r0 = r17 & 32
            if (r0 == 0) goto L2a
            java.lang.String r0 = "..."
            r7 = r0
            goto L2b
        L2a:
            r7 = r2
        L2b:
            r8 = 0
            r1 = r9
            r2 = r10
            m3998J(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    /* renamed from: L */
    public static java.lang.String m4000L(java.lang.Iterable r8, java.lang.CharSequence r9, java.lang.CharSequence r10, java.lang.CharSequence r11, int r12, java.lang.CharSequence r13, mh.InterfaceC4620l r14, int r15) {
            r13 = r15 & 1
            if (r13 == 0) goto L6
            java.lang.String r9 = ", "
        L6:
            r2 = r9
            r9 = r15 & 2
            java.lang.String r13 = ""
            if (r9 == 0) goto Lf
            r3 = r13
            goto L10
        Lf:
            r3 = r10
        L10:
            r9 = r15 & 4
            if (r9 == 0) goto L16
            r4 = r13
            goto L17
        L16:
            r4 = r11
        L17:
            r9 = r15 & 8
            if (r9 == 0) goto L1e
            r12 = -1
            r5 = -1
            goto L1f
        L1e:
            r5 = r12
        L1f:
            r9 = r15 & 16
            r10 = 0
            if (r9 == 0) goto L28
            java.lang.String r9 = "..."
            r6 = r9
            goto L29
        L28:
            r6 = r10
        L29:
            r9 = r15 & 32
            if (r9 == 0) goto L2f
            r7 = r10
            goto L30
        L2f:
            r7 = r14
        L30:
            java.lang.String r9 = "<this>"
            p214m2.C4339q.m9706k(r8, r9)
            java.lang.String r9 = "prefix"
            p214m2.C4339q.m9706k(r3, r9)
            java.lang.String r9 = "postfix"
            p214m2.C4339q.m9706k(r4, r9)
            java.lang.String r9 = "truncated"
            p214m2.C4339q.m9706k(r6, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r0 = r8
            r1 = r9
            m3998J(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r8 = r9.toString()
            java.lang.String r9 = "joinTo(StringBuilder(), \u2026ed, transform).toString()"
            p214m2.C4339q.m9705j(r8, r9)
            return r8
    }

    /* renamed from: M */
    public static final <T> T m4001M(java.util.List<? extends T> r1) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L14
            int r0 = p074e9.C1805a.m4527l(r1)
            java.lang.Object r1 = r1.get(r0)
            return r1
        L14:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "List is empty."
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: N */
    public static final <T> T m4002N(java.util.List<? extends T> r1) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Ld
            r1 = 0
            goto L17
        Ld:
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.get(r0)
        L17:
            return r1
    }

    /* renamed from: O */
    public static final <T> java.util.List<T> m4003O(java.lang.Iterable<? extends T> r2) {
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            r1 = 1
            if (r0 > r1) goto Lf
            java.util.List r2 = m4007S(r2)
            return r2
        Lf:
            java.util.List r2 = m4008T(r2)
            java.util.Collections.reverse(r2)
            return r2
    }

    /* renamed from: P */
    public static final <T> java.util.List<T> m4004P(java.lang.Iterable<? extends T> r3, java.util.Comparator<? super T> r4) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r3, r0)
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L2f
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r1 = r0.size()
            r2 = 1
            if (r1 > r2) goto L18
            java.util.List r3 = m4007S(r3)
            return r3
        L18:
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            java.util.Objects.requireNonNull(r3, r0)
            int r0 = r3.length
            if (r0 <= r2) goto L2a
            java.util.Arrays.sort(r3, r4)
        L2a:
            java.util.List r3 = p062dh.C1468d.m3982D(r3)
            return r3
        L2f:
            java.util.List r3 = m4008T(r3)
            p062dh.C1470f.m3993E(r3, r4)
            return r3
    }

    /* renamed from: Q */
    public static final <T> java.util.List<T> m4005Q(java.lang.Iterable<? extends T> r4, int r5) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r4, r0)
            r0 = 1
            r1 = 0
            if (r5 < 0) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = 0
        Lc:
            if (r2 == 0) goto L6b
            if (r5 != 0) goto L13
            dh.k r4 = p062dh.C1475k.f7237Y
            return r4
        L13:
            boolean r2 = r4 instanceof java.util.Collection
            if (r2 == 0) goto L4d
            r2 = r4
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            if (r5 < r2) goto L25
            java.util.List r4 = m4007S(r4)
            return r4
        L25:
            if (r5 != r0) goto L4d
            boolean r5 = r4 instanceof java.util.List
            if (r5 == 0) goto L32
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r4 = m3995G(r4)
            goto L40
        L32:
            java.util.Iterator r4 = r4.iterator()
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L45
            java.lang.Object r4 = r4.next()
        L40:
            java.util.List r4 = p074e9.C1805a.m4528m(r4)
            return r4
        L45:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Collection is empty."
            r4.<init>(r5)
            throw r4
        L4d:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L56:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L66
            java.lang.Object r3 = r4.next()
            r2.add(r3)
            int r1 = r1 + r0
            if (r1 != r5) goto L56
        L66:
            java.util.List r4 = p074e9.C1805a.m4534s(r2)
            return r4
        L6b:
            java.lang.String r4 = "Requested element count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r4 = android.support.v4.media.C0146e.m258a(r4, r5, r0)
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    /* renamed from: R */
    public static final <T, C extends java.util.Collection<? super T>> C m4006R(java.lang.Iterable<? extends T> r1, C r2) {
            java.util.Iterator r1 = r1.iterator()
        L4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L12
            java.lang.Object r0 = r1.next()
            r2.add(r0)
            goto L4
        L12:
            return r2
    }

    /* renamed from: S */
    public static final <T> java.util.List<T> m4007S(java.lang.Iterable<? extends T> r3) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r3, r0)
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L36
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r1 = r0.size()
            if (r1 == 0) goto L33
            r2 = 1
            if (r1 == r2) goto L1a
            java.util.List r3 = m4009U(r0)
            goto L35
        L1a:
            boolean r0 = r3 instanceof java.util.List
            if (r0 == 0) goto L26
            java.util.List r3 = (java.util.List) r3
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            goto L2e
        L26:
            java.util.Iterator r3 = r3.iterator()
            java.lang.Object r3 = r3.next()
        L2e:
            java.util.List r3 = p074e9.C1805a.m4528m(r3)
            goto L35
        L33:
            dh.k r3 = p062dh.C1475k.f7237Y
        L35:
            return r3
        L36:
            java.util.List r3 = m4008T(r3)
            java.util.List r3 = p074e9.C1805a.m4534s(r3)
            return r3
    }

    /* renamed from: T */
    public static final <T> java.util.List<T> m4008T(java.lang.Iterable<? extends T> r1) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Lb
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.List r1 = m4009U(r1)
            return r1
        Lb:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            m4006R(r1, r0)
            return r0
    }

    /* renamed from: U */
    public static final <T> java.util.List<T> m4009U(java.util.Collection<? extends T> r1) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            return r0
    }

    /* renamed from: V */
    public static final <T> java.util.Set<T> m4010V(java.lang.Iterable<? extends T> r1) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            java.util.Collection r1 = (java.util.Collection) r1
            r0.<init>(r1)
            return r0
    }

    /* renamed from: W */
    public static final <T> java.util.Set<T> m4011W(java.lang.Iterable<? extends T> r4) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r4, r0)
            boolean r0 = r4 instanceof java.util.Collection
            java.lang.String r1 = "singleton(element)"
            r2 = 1
            if (r0 == 0) goto L48
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            int r3 = r0.size()
            if (r3 == 0) goto L45
            if (r3 == r2) goto L28
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            int r0 = r0.size()
            int r0 = p185k7.C4038x4.m9097j(r0)
            r1.<init>(r0)
            m4006R(r4, r1)
            goto L47
        L28:
            boolean r0 = r4 instanceof java.util.List
            if (r0 == 0) goto L34
            java.util.List r4 = (java.util.List) r4
            r0 = 0
            java.lang.Object r4 = r4.get(r0)
            goto L3c
        L34:
            java.util.Iterator r4 = r4.iterator()
            java.lang.Object r4 = r4.next()
        L3c:
            java.util.Set r4 = java.util.Collections.singleton(r4)
            p214m2.C4339q.m9705j(r4, r1)
            r1 = r4
            goto L47
        L45:
            dh.m r1 = p062dh.C1477m.f7239Y
        L47:
            return r1
        L48:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            m4006R(r4, r0)
            int r4 = r0.size()
            if (r4 == 0) goto L69
            if (r4 == r2) goto L59
            goto L6b
        L59:
            java.util.Iterator r4 = r0.iterator()
            java.lang.Object r4 = r4.next()
            java.util.Set r0 = java.util.Collections.singleton(r4)
            p214m2.C4339q.m9705j(r0, r1)
            goto L6b
        L69:
            dh.m r0 = p062dh.C1477m.f7239Y
        L6b:
            return r0
    }
}
