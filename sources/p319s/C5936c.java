package p319s;

/* renamed from: s.c */
/* loaded from: classes.dex */
public final class C5936c<E> implements java.util.Collection<E>, java.util.Set<E> {

    /* renamed from: c0 */
    public static final int[] f22765c0 = null;

    /* renamed from: d0 */
    public static final java.lang.Object[] f22766d0 = null;

    /* renamed from: e0 */
    public static java.lang.Object[] f22767e0;

    /* renamed from: f0 */
    public static int f22768f0;

    /* renamed from: g0 */
    public static java.lang.Object[] f22769g0;

    /* renamed from: h0 */
    public static int f22770h0;

    /* renamed from: Y */
    public int[] f22771Y;

    /* renamed from: Z */
    public java.lang.Object[] f22772Z;

    /* renamed from: a0 */
    public int f22773a0;

    /* renamed from: b0 */
    public p319s.AbstractC5940g<E, E> f22774b0;

    static {
            r0 = 0
            int[] r1 = new int[r0]
            p319s.C5936c.f22765c0 = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            p319s.C5936c.f22766d0 = r0
            return
    }

    public C5936c() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public C5936c(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto Le
            int[] r1 = p319s.C5936c.f22765c0
            r0.f22771Y = r1
            java.lang.Object[] r1 = p319s.C5936c.f22766d0
            r0.f22772Z = r1
            goto L11
        Le:
            r0.m12310a(r1)
        L11:
            r1 = 0
            r0.f22773a0 = r1
            return
    }

    /* renamed from: e */
    public static void m12309e(int[] r7, java.lang.Object[] r8, int r9) {
            int r0 = r7.length
            r1 = 0
            r2 = 2
            r3 = 0
            r4 = 10
            r5 = 1
            r6 = 8
            if (r0 != r6) goto L2c
            java.lang.Class<s.c> r0 = p319s.C5936c.class
            monitor-enter(r0)
            int r6 = p319s.C5936c.f22770h0     // Catch: java.lang.Throwable -> L29
            if (r6 >= r4) goto L27
            java.lang.Object[] r4 = p319s.C5936c.f22769g0     // Catch: java.lang.Throwable -> L29
            r8[r3] = r4     // Catch: java.lang.Throwable -> L29
            r8[r5] = r7     // Catch: java.lang.Throwable -> L29
            int r9 = r9 - r5
        L19:
            if (r9 < r2) goto L20
            r8[r9] = r1     // Catch: java.lang.Throwable -> L29
            int r9 = r9 + (-1)
            goto L19
        L20:
            p319s.C5936c.f22769g0 = r8     // Catch: java.lang.Throwable -> L29
            int r7 = p319s.C5936c.f22770h0     // Catch: java.lang.Throwable -> L29
            int r7 = r7 + r5
            p319s.C5936c.f22770h0 = r7     // Catch: java.lang.Throwable -> L29
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            goto L51
        L29:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r7
        L2c:
            int r0 = r7.length
            r6 = 4
            if (r0 != r6) goto L51
            java.lang.Class<s.c> r0 = p319s.C5936c.class
            monitor-enter(r0)
            int r6 = p319s.C5936c.f22768f0     // Catch: java.lang.Throwable -> L4e
            if (r6 >= r4) goto L4c
            java.lang.Object[] r4 = p319s.C5936c.f22767e0     // Catch: java.lang.Throwable -> L4e
            r8[r3] = r4     // Catch: java.lang.Throwable -> L4e
            r8[r5] = r7     // Catch: java.lang.Throwable -> L4e
            int r9 = r9 - r5
        L3e:
            if (r9 < r2) goto L45
            r8[r9] = r1     // Catch: java.lang.Throwable -> L4e
            int r9 = r9 + (-1)
            goto L3e
        L45:
            p319s.C5936c.f22767e0 = r8     // Catch: java.lang.Throwable -> L4e
            int r7 = p319s.C5936c.f22768f0     // Catch: java.lang.Throwable -> L4e
            int r7 = r7 + r5
            p319s.C5936c.f22768f0 = r7     // Catch: java.lang.Throwable -> L4e
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            goto L51
        L4e:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            throw r7
        L51:
            return
    }

    /* renamed from: a */
    public final void m12310a(int r6) {
            r5 = this;
            r0 = 0
            r1 = 0
            r2 = 1
            r3 = 8
            if (r6 != r3) goto L2c
            java.lang.Class<s.c> r3 = p319s.C5936c.class
            monitor-enter(r3)
            java.lang.Object[] r4 = p319s.C5936c.f22769g0     // Catch: java.lang.Throwable -> L29
            if (r4 == 0) goto L27
            r5.f22772Z = r4     // Catch: java.lang.Throwable -> L29
            r6 = r4[r1]     // Catch: java.lang.Throwable -> L29
            java.lang.Object[] r6 = (java.lang.Object[]) r6     // Catch: java.lang.Throwable -> L29
            p319s.C5936c.f22769g0 = r6     // Catch: java.lang.Throwable -> L29
            r6 = r4[r2]     // Catch: java.lang.Throwable -> L29
            int[] r6 = (int[]) r6     // Catch: java.lang.Throwable -> L29
            r5.f22771Y = r6     // Catch: java.lang.Throwable -> L29
            r4[r2] = r0     // Catch: java.lang.Throwable -> L29
            r4[r1] = r0     // Catch: java.lang.Throwable -> L29
            int r6 = p319s.C5936c.f22770h0     // Catch: java.lang.Throwable -> L29
            int r6 = r6 - r2
            p319s.C5936c.f22770h0 = r6     // Catch: java.lang.Throwable -> L29
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
            return
        L27:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
            goto L54
        L29:
            r6 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
            throw r6
        L2c:
            r3 = 4
            if (r6 != r3) goto L54
            java.lang.Class<s.c> r3 = p319s.C5936c.class
            monitor-enter(r3)
            java.lang.Object[] r4 = p319s.C5936c.f22767e0     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto L4f
            r5.f22772Z = r4     // Catch: java.lang.Throwable -> L51
            r6 = r4[r1]     // Catch: java.lang.Throwable -> L51
            java.lang.Object[] r6 = (java.lang.Object[]) r6     // Catch: java.lang.Throwable -> L51
            p319s.C5936c.f22767e0 = r6     // Catch: java.lang.Throwable -> L51
            r6 = r4[r2]     // Catch: java.lang.Throwable -> L51
            int[] r6 = (int[]) r6     // Catch: java.lang.Throwable -> L51
            r5.f22771Y = r6     // Catch: java.lang.Throwable -> L51
            r4[r2] = r0     // Catch: java.lang.Throwable -> L51
            r4[r1] = r0     // Catch: java.lang.Throwable -> L51
            int r6 = p319s.C5936c.f22768f0     // Catch: java.lang.Throwable -> L51
            int r6 = r6 - r2
            p319s.C5936c.f22768f0 = r6     // Catch: java.lang.Throwable -> L51
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L51
            return
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L51
            goto L54
        L51:
            r6 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L51
            throw r6
        L54:
            int[] r0 = new int[r6]
            r5.f22771Y = r0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r5.f22772Z = r6
            return
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E r9) {
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L9
            int r1 = r8.m12312i()
            r2 = 0
            goto L14
        L9:
            int r1 = r9.hashCode()
            int r2 = r8.m12311h(r9, r1)
            r7 = r2
            r2 = r1
            r1 = r7
        L14:
            if (r1 < 0) goto L17
            return r0
        L17:
            int r1 = ~r1
            int r3 = r8.f22773a0
            int[] r4 = r8.f22771Y
            int r5 = r4.length
            if (r3 < r5) goto L45
            r5 = 4
            r6 = 8
            if (r3 < r6) goto L28
            int r5 = r3 >> 1
            int r5 = r5 + r3
            goto L2c
        L28:
            if (r3 < r5) goto L2c
            r5 = 8
        L2c:
            java.lang.Object[] r3 = r8.f22772Z
            r8.m12310a(r5)
            int[] r5 = r8.f22771Y
            int r6 = r5.length
            if (r6 <= 0) goto L40
            int r6 = r4.length
            java.lang.System.arraycopy(r4, r0, r5, r0, r6)
            java.lang.Object[] r5 = r8.f22772Z
            int r6 = r3.length
            java.lang.System.arraycopy(r3, r0, r5, r0, r6)
        L40:
            int r0 = r8.f22773a0
            m12309e(r4, r3, r0)
        L45:
            int r0 = r8.f22773a0
            if (r1 >= r0) goto L59
            int[] r3 = r8.f22771Y
            int r4 = r1 + 1
            int r0 = r0 - r1
            java.lang.System.arraycopy(r3, r1, r3, r4, r0)
            java.lang.Object[] r0 = r8.f22772Z
            int r3 = r8.f22773a0
            int r3 = r3 - r1
            java.lang.System.arraycopy(r0, r1, r0, r4, r3)
        L59:
            int[] r0 = r8.f22771Y
            r0[r1] = r2
            java.lang.Object[] r0 = r8.f22772Z
            r0[r1] = r9
            int r9 = r8.f22773a0
            r0 = 1
            int r9 = r9 + r0
            r8.f22773a0 = r9
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(java.util.Collection<? extends E> r6) {
            r5 = this;
            int r0 = r5.f22773a0
            int r1 = r6.size()
            int r1 = r1 + r0
            int[] r0 = r5.f22771Y
            int r2 = r0.length
            r3 = 0
            if (r2 >= r1) goto L27
            java.lang.Object[] r2 = r5.f22772Z
            r5.m12310a(r1)
            int r1 = r5.f22773a0
            if (r1 <= 0) goto L22
            int[] r4 = r5.f22771Y
            java.lang.System.arraycopy(r0, r3, r4, r3, r1)
            java.lang.Object[] r1 = r5.f22772Z
            int r4 = r5.f22773a0
            java.lang.System.arraycopy(r2, r3, r1, r3, r4)
        L22:
            int r1 = r5.f22773a0
            m12309e(r0, r2, r1)
        L27:
            java.util.Iterator r6 = r6.iterator()
        L2b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r6.next()
            boolean r0 = r5.add(r0)
            r3 = r3 | r0
            goto L2b
        L3b:
            return r3
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
            r3 = this;
            int r0 = r3.f22773a0
            if (r0 == 0) goto L16
            int[] r1 = r3.f22771Y
            java.lang.Object[] r2 = r3.f22772Z
            m12309e(r1, r2, r0)
            int[] r0 = p319s.C5936c.f22765c0
            r3.f22771Y = r0
            java.lang.Object[] r0 = p319s.C5936c.f22766d0
            r3.f22772Z = r0
            r0 = 0
            r3.f22773a0 = r0
        L16:
            return
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r2.next()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L4
            r2 = 0
            return r2
        L16:
            r2 = 1
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof java.util.Set
            r2 = 0
            if (r1 == 0) goto L28
            java.util.Set r5 = (java.util.Set) r5
            int r1 = r4.f22773a0
            int r3 = r5.size()
            if (r1 == r3) goto L14
            return r2
        L14:
            r1 = 0
        L15:
            int r3 = r4.f22773a0     // Catch: java.lang.Throwable -> L28
            if (r1 >= r3) goto L27
            java.lang.Object[] r3 = r4.f22772Z     // Catch: java.lang.Throwable -> L28
            r3 = r3[r1]     // Catch: java.lang.Throwable -> L28
            boolean r3 = r5.contains(r3)     // Catch: java.lang.Throwable -> L28
            if (r3 != 0) goto L24
            return r2
        L24:
            int r1 = r1 + 1
            goto L15
        L27:
            return r0
        L28:
            return r2
    }

    /* renamed from: h */
    public final int m12311h(java.lang.Object r6, int r7) {
            r5 = this;
            int r0 = r5.f22773a0
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            int[] r2 = r5.f22771Y
            int r2 = p319s.C5937d.m12314a(r2, r0, r7)
            if (r2 >= 0) goto Lf
            return r2
        Lf:
            java.lang.Object[] r3 = r5.f22772Z
            r3 = r3[r2]
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L1a
            return r2
        L1a:
            int r3 = r2 + 1
        L1c:
            if (r3 >= r0) goto L32
            int[] r4 = r5.f22771Y
            r4 = r4[r3]
            if (r4 != r7) goto L32
            java.lang.Object[] r4 = r5.f22772Z
            r4 = r4[r3]
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L2f
            return r3
        L2f:
            int r3 = r3 + 1
            goto L1c
        L32:
            int r2 = r2 + r1
        L33:
            if (r2 < 0) goto L49
            int[] r0 = r5.f22771Y
            r0 = r0[r2]
            if (r0 != r7) goto L49
            java.lang.Object[] r0 = r5.f22772Z
            r0 = r0[r2]
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L46
            return r2
        L46:
            int r2 = r2 + (-1)
            goto L33
        L49:
            int r6 = ~r3
            return r6
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
            r5 = this;
            int[] r0 = r5.f22771Y
            int r1 = r5.f22773a0
            r2 = 0
            r3 = 0
        L6:
            if (r2 >= r1) goto Le
            r4 = r0[r2]
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L6
        Le:
            return r3
    }

    /* renamed from: i */
    public final int m12312i() {
            r4 = this;
            int r0 = r4.f22773a0
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            int[] r1 = r4.f22771Y
            r2 = 0
            int r1 = p319s.C5937d.m12314a(r1, r0, r2)
            if (r1 >= 0) goto L10
            return r1
        L10:
            java.lang.Object[] r2 = r4.f22772Z
            r2 = r2[r1]
            if (r2 != 0) goto L17
            return r1
        L17:
            int r2 = r1 + 1
        L19:
            if (r2 >= r0) goto L2b
            int[] r3 = r4.f22771Y
            r3 = r3[r2]
            if (r3 != 0) goto L2b
            java.lang.Object[] r3 = r4.f22772Z
            r3 = r3[r2]
            if (r3 != 0) goto L28
            return r2
        L28:
            int r2 = r2 + 1
            goto L19
        L2b:
            int r1 = r1 + (-1)
        L2d:
            if (r1 < 0) goto L3f
            int[] r0 = r4.f22771Y
            r0 = r0[r1]
            if (r0 != 0) goto L3f
            java.lang.Object[] r0 = r4.f22772Z
            r0 = r0[r1]
            if (r0 != 0) goto L3c
            return r1
        L3c:
            int r1 = r1 + (-1)
            goto L2d
        L3f:
            int r0 = ~r2
            return r0
    }

    public int indexOf(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L7
            int r2 = r1.m12312i()
            goto Lf
        L7:
            int r0 = r2.hashCode()
            int r2 = r1.m12311h(r2, r0)
        Lf:
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.f22773a0
            if (r0 > 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<E> iterator() {
            r2 = this;
            s.g<E, E> r0 = r2.f22774b0
            if (r0 != 0) goto Lb
            s.b r0 = new s.b
            r0.<init>(r2)
            r2.f22774b0 = r0
        Lb:
            s.g<E, E> r0 = r2.f22774b0
            s.g<K, V>$c r1 = r0.f22792b
            if (r1 != 0) goto L18
            s.g$c r1 = new s.g$c
            r1.<init>(r0)
            r0.f22792b = r1
        L18:
            s.g<K, V>$c r0 = r0.f22792b
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    /* renamed from: l */
    public E m12313l(int r9) {
            r8 = this;
            java.lang.Object[] r0 = r8.f22772Z
            r1 = r0[r9]
            int r2 = r8.f22773a0
            r3 = 0
            r4 = 1
            if (r2 > r4) goto L1a
            int[] r9 = r8.f22771Y
            m12309e(r9, r0, r2)
            int[] r9 = p319s.C5936c.f22765c0
            r8.f22771Y = r9
            java.lang.Object[] r9 = p319s.C5936c.f22766d0
            r8.f22772Z = r9
            r8.f22773a0 = r3
            goto L6f
        L1a:
            int[] r5 = r8.f22771Y
            int r6 = r5.length
            r7 = 8
            if (r6 <= r7) goto L55
            int r6 = r5.length
            int r6 = r6 / 3
            if (r2 >= r6) goto L55
            if (r2 <= r7) goto L2c
            int r6 = r2 >> 1
            int r7 = r2 + r6
        L2c:
            r8.m12310a(r7)
            int r2 = r8.f22773a0
            int r2 = r2 - r4
            r8.f22773a0 = r2
            if (r9 <= 0) goto L40
            int[] r2 = r8.f22771Y
            java.lang.System.arraycopy(r5, r3, r2, r3, r9)
            java.lang.Object[] r2 = r8.f22772Z
            java.lang.System.arraycopy(r0, r3, r2, r3, r9)
        L40:
            int r2 = r8.f22773a0
            if (r9 >= r2) goto L6f
            int r3 = r9 + 1
            int[] r4 = r8.f22771Y
            int r2 = r2 - r9
            java.lang.System.arraycopy(r5, r3, r4, r9, r2)
            java.lang.Object[] r2 = r8.f22772Z
            int r4 = r8.f22773a0
            int r4 = r4 - r9
            java.lang.System.arraycopy(r0, r3, r2, r9, r4)
            goto L6f
        L55:
            int r2 = r2 - r4
            r8.f22773a0 = r2
            if (r9 >= r2) goto L68
            int r0 = r9 + 1
            int r2 = r2 - r9
            java.lang.System.arraycopy(r5, r0, r5, r9, r2)
            java.lang.Object[] r2 = r8.f22772Z
            int r3 = r8.f22773a0
            int r3 = r3 - r9
            java.lang.System.arraycopy(r2, r0, r2, r9, r3)
        L68:
            java.lang.Object[] r9 = r8.f22772Z
            int r0 = r8.f22773a0
            r2 = 0
            r9[r0] = r2
        L6f:
            return r1
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto Lb
            r0.m12313l(r1)
            r1 = 1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(java.util.Collection<?> r3) {
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L5:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L15
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.remove(r1)
            r0 = r0 | r1
            goto L5
        L15:
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(java.util.Collection<?> r5) {
            r4 = this;
            int r0 = r4.f22773a0
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
        L5:
            if (r0 < 0) goto L18
            java.lang.Object[] r3 = r4.f22772Z
            r3 = r3[r0]
            boolean r3 = r5.contains(r3)
            if (r3 != 0) goto L15
            r4.m12313l(r0)
            r2 = 1
        L15:
            int r0 = r0 + (-1)
            goto L5
        L18:
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            int r0 = r1.f22773a0
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public java.lang.Object[] toArray() {
            r4 = this;
            int r0 = r4.f22773a0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Object[] r2 = r4.f22772Z
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r1, r3, r0)
            return r1
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] r4) {
            r3 = this;
            int r0 = r4.length
            int r1 = r3.f22773a0
            if (r0 >= r1) goto L15
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r4 = r4.getComponentType()
            int r0 = r3.f22773a0
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r0)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
        L15:
            java.lang.Object[] r0 = r3.f22772Z
            int r1 = r3.f22773a0
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            int r0 = r4.length
            int r1 = r3.f22773a0
            if (r0 <= r1) goto L25
            r0 = 0
            r4[r1] = r0
        L25:
            return r4
    }

    public java.lang.String toString() {
            r3 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r3.f22773a0
            int r1 = r1 * 14
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r1 = 0
        L18:
            int r2 = r3.f22773a0
            if (r1 >= r2) goto L35
            if (r1 <= 0) goto L23
            java.lang.String r2 = ", "
            r0.append(r2)
        L23:
            java.lang.Object[] r2 = r3.f22772Z
            r2 = r2[r1]
            if (r2 == r3) goto L2d
            r0.append(r2)
            goto L32
        L2d:
            java.lang.String r2 = "(this Set)"
            r0.append(r2)
        L32:
            int r1 = r1 + 1
            goto L18
        L35:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
