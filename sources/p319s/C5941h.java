package p319s;

/* renamed from: s.h */
/* loaded from: classes.dex */
public class C5941h<K, V> {

    /* renamed from: b0 */
    public static java.lang.Object[] f22806b0;

    /* renamed from: c0 */
    public static int f22807c0;

    /* renamed from: d0 */
    public static java.lang.Object[] f22808d0;

    /* renamed from: e0 */
    public static int f22809e0;

    /* renamed from: Y */
    public int[] f22810Y;

    /* renamed from: Z */
    public java.lang.Object[] f22811Z;

    /* renamed from: a0 */
    public int f22812a0;

    public C5941h() {
            r1 = this;
            r1.<init>()
            int[] r0 = p319s.C5937d.f22775a
            r1.f22810Y = r0
            java.lang.Object[] r0 = p319s.C5937d.f22777c
            r1.f22811Z = r0
            r0 = 0
            r1.f22812a0 = r0
            return
    }

    public C5941h(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto Le
            int[] r1 = p319s.C5937d.f22775a
            r0.f22810Y = r1
            java.lang.Object[] r1 = p319s.C5937d.f22777c
            r0.f22811Z = r1
            goto L11
        Le:
            r0.m12336a(r1)
        L11:
            r1 = 0
            r0.f22812a0 = r1
            return
    }

    /* renamed from: a */
    private void m12336a(int r6) {
            r5 = this;
            java.lang.Class<s.h> r0 = p319s.C5941h.class
            r1 = 0
            r2 = 0
            r3 = 1
            r4 = 8
            if (r6 != r4) goto L2c
            monitor-enter(r0)
            java.lang.Object[] r4 = p319s.C5941h.f22808d0     // Catch: java.lang.Throwable -> L29
            if (r4 == 0) goto L27
            r5.f22811Z = r4     // Catch: java.lang.Throwable -> L29
            r6 = r4[r2]     // Catch: java.lang.Throwable -> L29
            java.lang.Object[] r6 = (java.lang.Object[]) r6     // Catch: java.lang.Throwable -> L29
            p319s.C5941h.f22808d0 = r6     // Catch: java.lang.Throwable -> L29
            r6 = r4[r3]     // Catch: java.lang.Throwable -> L29
            int[] r6 = (int[]) r6     // Catch: java.lang.Throwable -> L29
            r5.f22810Y = r6     // Catch: java.lang.Throwable -> L29
            r4[r3] = r1     // Catch: java.lang.Throwable -> L29
            r4[r2] = r1     // Catch: java.lang.Throwable -> L29
            int r6 = p319s.C5941h.f22809e0     // Catch: java.lang.Throwable -> L29
            int r6 = r6 - r3
            p319s.C5941h.f22809e0 = r6     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            return
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            goto L52
        L29:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r6
        L2c:
            r4 = 4
            if (r6 != r4) goto L52
            monitor-enter(r0)
            java.lang.Object[] r4 = p319s.C5941h.f22806b0     // Catch: java.lang.Throwable -> L4f
            if (r4 == 0) goto L4d
            r5.f22811Z = r4     // Catch: java.lang.Throwable -> L4f
            r6 = r4[r2]     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r6 = (java.lang.Object[]) r6     // Catch: java.lang.Throwable -> L4f
            p319s.C5941h.f22806b0 = r6     // Catch: java.lang.Throwable -> L4f
            r6 = r4[r3]     // Catch: java.lang.Throwable -> L4f
            int[] r6 = (int[]) r6     // Catch: java.lang.Throwable -> L4f
            r5.f22810Y = r6     // Catch: java.lang.Throwable -> L4f
            r4[r3] = r1     // Catch: java.lang.Throwable -> L4f
            r4[r2] = r1     // Catch: java.lang.Throwable -> L4f
            int r6 = p319s.C5941h.f22807c0     // Catch: java.lang.Throwable -> L4f
            int r6 = r6 - r3
            p319s.C5941h.f22807c0 = r6     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            return
        L4d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            goto L52
        L4f:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            throw r6
        L52:
            int[] r0 = new int[r6]
            r5.f22810Y = r0
            int r6 = r6 << r3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r5.f22811Z = r6
            return
    }

    /* renamed from: c */
    public static void m12337c(int[] r8, java.lang.Object[] r9, int r10) {
            java.lang.Class<s.h> r0 = p319s.C5941h.class
            int r1 = r8.length
            r2 = 0
            r3 = 2
            r4 = 0
            r5 = 10
            r6 = 1
            r7 = 8
            if (r1 != r7) goto L2e
            monitor-enter(r0)
            int r1 = p319s.C5941h.f22809e0     // Catch: java.lang.Throwable -> L2b
            if (r1 >= r5) goto L29
            java.lang.Object[] r1 = p319s.C5941h.f22808d0     // Catch: java.lang.Throwable -> L2b
            r9[r4] = r1     // Catch: java.lang.Throwable -> L2b
            r9[r6] = r8     // Catch: java.lang.Throwable -> L2b
            int r8 = r10 << 1
            int r8 = r8 - r6
        L1b:
            if (r8 < r3) goto L22
            r9[r8] = r2     // Catch: java.lang.Throwable -> L2b
            int r8 = r8 + (-1)
            goto L1b
        L22:
            p319s.C5941h.f22808d0 = r9     // Catch: java.lang.Throwable -> L2b
            int r8 = p319s.C5941h.f22809e0     // Catch: java.lang.Throwable -> L2b
            int r8 = r8 + r6
            p319s.C5941h.f22809e0 = r8     // Catch: java.lang.Throwable -> L2b
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            goto L53
        L2b:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r8
        L2e:
            int r1 = r8.length
            r7 = 4
            if (r1 != r7) goto L53
            monitor-enter(r0)
            int r1 = p319s.C5941h.f22807c0     // Catch: java.lang.Throwable -> L50
            if (r1 >= r5) goto L4e
            java.lang.Object[] r1 = p319s.C5941h.f22806b0     // Catch: java.lang.Throwable -> L50
            r9[r4] = r1     // Catch: java.lang.Throwable -> L50
            r9[r6] = r8     // Catch: java.lang.Throwable -> L50
            int r8 = r10 << 1
            int r8 = r8 - r6
        L40:
            if (r8 < r3) goto L47
            r9[r8] = r2     // Catch: java.lang.Throwable -> L50
            int r8 = r8 + (-1)
            goto L40
        L47:
            p319s.C5941h.f22806b0 = r9     // Catch: java.lang.Throwable -> L50
            int r8 = p319s.C5941h.f22807c0     // Catch: java.lang.Throwable -> L50
            int r8 = r8 + r6
            p319s.C5941h.f22807c0 = r8     // Catch: java.lang.Throwable -> L50
        L4e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            goto L53
        L50:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            throw r8
        L53:
            return
    }

    /* renamed from: b */
    public void m12338b(int r6) {
            r5 = this;
            int r0 = r5.f22812a0
            int[] r1 = r5.f22810Y
            int r2 = r1.length
            if (r2 >= r6) goto L20
            java.lang.Object[] r2 = r5.f22811Z
            r5.m12336a(r6)
            int r6 = r5.f22812a0
            if (r6 <= 0) goto L1d
            int[] r6 = r5.f22810Y
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r6, r3, r0)
            java.lang.Object[] r6 = r5.f22811Z
            int r4 = r0 << 1
            java.lang.System.arraycopy(r2, r3, r6, r3, r4)
        L1d:
            m12337c(r1, r2, r0)
        L20:
            int r6 = r5.f22812a0
            if (r6 != r0) goto L25
            return
        L25:
            java.util.ConcurrentModificationException r6 = new java.util.ConcurrentModificationException
            r6.<init>()
            throw r6
    }

    public void clear() {
            r4 = this;
            int r0 = r4.f22812a0
            if (r0 <= 0) goto L16
            int[] r1 = r4.f22810Y
            java.lang.Object[] r2 = r4.f22811Z
            int[] r3 = p319s.C5937d.f22775a
            r4.f22810Y = r3
            java.lang.Object[] r3 = p319s.C5937d.f22777c
            r4.f22811Z = r3
            r3 = 0
            r4.f22812a0 = r3
            m12337c(r1, r2, r0)
        L16:
            int r0 = r4.f22812a0
            if (r0 > 0) goto L1b
            return
        L1b:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }

    public boolean containsKey(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.m12340e(r1)
            if (r1 < 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public boolean containsValue(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.m12342g(r1)
            if (r1 < 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    /* renamed from: d */
    public int m12339d(java.lang.Object r7, int r8) {
            r6 = this;
            int r0 = r6.f22812a0
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            int[] r2 = r6.f22810Y
            int r2 = p319s.C5937d.m12314a(r2, r0, r8)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L51
            if (r2 >= 0) goto Lf
            return r2
        Lf:
            java.lang.Object[] r3 = r6.f22811Z
            int r4 = r2 << 1
            r3 = r3[r4]
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L1c
            return r2
        L1c:
            int r3 = r2 + 1
        L1e:
            if (r3 >= r0) goto L36
            int[] r4 = r6.f22810Y
            r4 = r4[r3]
            if (r4 != r8) goto L36
            java.lang.Object[] r4 = r6.f22811Z
            int r5 = r3 << 1
            r4 = r4[r5]
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L33
            return r3
        L33:
            int r3 = r3 + 1
            goto L1e
        L36:
            int r2 = r2 + r1
        L37:
            if (r2 < 0) goto L4f
            int[] r0 = r6.f22810Y
            r0 = r0[r2]
            if (r0 != r8) goto L4f
            java.lang.Object[] r0 = r6.f22811Z
            int r1 = r2 << 1
            r0 = r0[r1]
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L4c
            return r2
        L4c:
            int r2 = r2 + (-1)
            goto L37
        L4f:
            int r7 = ~r3
            return r7
        L51:
            java.util.ConcurrentModificationException r7 = new java.util.ConcurrentModificationException
            r7.<init>()
            throw r7
    }

    /* renamed from: e */
    public int m12340e(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L7
            int r2 = r1.m12341f()
            goto Lf
        L7:
            int r0 = r2.hashCode()
            int r2 = r1.m12339d(r2, r0)
        Lf:
            return r2
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof p319s.C5941h
            r2 = 0
            if (r1 == 0) goto L3a
            s.h r7 = (p319s.C5941h) r7
            int r1 = r6.f22812a0
            int r3 = r7.f22812a0
            if (r1 == r3) goto L12
            return r2
        L12:
            r1 = 0
        L13:
            int r3 = r6.f22812a0     // Catch: java.lang.Throwable -> L39
            if (r1 >= r3) goto L38
            java.lang.Object r3 = r6.m12343h(r1)     // Catch: java.lang.Throwable -> L39
            java.lang.Object r4 = r6.m12344l(r1)     // Catch: java.lang.Throwable -> L39
            java.lang.Object r5 = r7.get(r3)     // Catch: java.lang.Throwable -> L39
            if (r4 != 0) goto L2e
            if (r5 != 0) goto L2d
            boolean r3 = r7.containsKey(r3)     // Catch: java.lang.Throwable -> L39
            if (r3 != 0) goto L35
        L2d:
            return r2
        L2e:
            boolean r3 = r4.equals(r5)     // Catch: java.lang.Throwable -> L39
            if (r3 != 0) goto L35
            return r2
        L35:
            int r1 = r1 + 1
            goto L13
        L38:
            return r0
        L39:
            return r2
        L3a:
            boolean r1 = r7 instanceof java.util.Map
            if (r1 == 0) goto L70
            java.util.Map r7 = (java.util.Map) r7
            int r1 = r6.f22812a0
            int r3 = r7.size()
            if (r1 == r3) goto L49
            return r2
        L49:
            r1 = 0
        L4a:
            int r3 = r6.f22812a0     // Catch: java.lang.Throwable -> L70
            if (r1 >= r3) goto L6f
            java.lang.Object r3 = r6.m12343h(r1)     // Catch: java.lang.Throwable -> L70
            java.lang.Object r4 = r6.m12344l(r1)     // Catch: java.lang.Throwable -> L70
            java.lang.Object r5 = r7.get(r3)     // Catch: java.lang.Throwable -> L70
            if (r4 != 0) goto L65
            if (r5 != 0) goto L64
            boolean r3 = r7.containsKey(r3)     // Catch: java.lang.Throwable -> L70
            if (r3 != 0) goto L6c
        L64:
            return r2
        L65:
            boolean r3 = r4.equals(r5)     // Catch: java.lang.Throwable -> L70
            if (r3 != 0) goto L6c
            return r2
        L6c:
            int r1 = r1 + 1
            goto L4a
        L6f:
            return r0
        L70:
            return r2
    }

    /* renamed from: f */
    public int m12341f() {
            r6 = this;
            int r0 = r6.f22812a0
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            int[] r2 = r6.f22810Y
            r3 = 0
            int r2 = p319s.C5937d.m12314a(r2, r0, r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L46
            if (r2 >= 0) goto L10
            return r2
        L10:
            java.lang.Object[] r3 = r6.f22811Z
            int r4 = r2 << 1
            r3 = r3[r4]
            if (r3 != 0) goto L19
            return r2
        L19:
            int r3 = r2 + 1
        L1b:
            if (r3 >= r0) goto L2f
            int[] r4 = r6.f22810Y
            r4 = r4[r3]
            if (r4 != 0) goto L2f
            java.lang.Object[] r4 = r6.f22811Z
            int r5 = r3 << 1
            r4 = r4[r5]
            if (r4 != 0) goto L2c
            return r3
        L2c:
            int r3 = r3 + 1
            goto L1b
        L2f:
            int r2 = r2 + r1
        L30:
            if (r2 < 0) goto L44
            int[] r0 = r6.f22810Y
            r0 = r0[r2]
            if (r0 != 0) goto L44
            java.lang.Object[] r0 = r6.f22811Z
            int r1 = r2 << 1
            r0 = r0[r1]
            if (r0 != 0) goto L41
            return r2
        L41:
            int r2 = r2 + (-1)
            goto L30
        L44:
            int r0 = ~r3
            return r0
        L46:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }

    /* renamed from: g */
    int m12342g(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.f22812a0
            int r0 = r0 * 2
            java.lang.Object[] r1 = r5.f22811Z
            r2 = 1
            if (r6 != 0) goto L15
            r6 = 1
        La:
            if (r6 >= r0) goto L26
            r3 = r1[r6]
            if (r3 != 0) goto L12
            int r6 = r6 >> r2
            return r6
        L12:
            int r6 = r6 + 2
            goto La
        L15:
            r3 = 1
        L16:
            if (r3 >= r0) goto L26
            r4 = r1[r3]
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L23
            int r6 = r3 >> 1
            return r6
        L23:
            int r3 = r3 + 2
            goto L16
        L26:
            r6 = -1
            return r6
    }

    public V get(java.lang.Object r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.getOrDefault(r2, r0)
            return r2
    }

    public V getOrDefault(java.lang.Object r1, V r2) {
            r0 = this;
            int r1 = r0.m12340e(r1)
            if (r1 < 0) goto Le
            java.lang.Object[] r2 = r0.f22811Z
            int r1 = r1 << 1
            int r1 = r1 + 1
            r2 = r2[r1]
        Le:
            return r2
    }

    /* renamed from: h */
    public K m12343h(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.f22811Z
            int r2 = r2 << 1
            r2 = r0[r2]
            return r2
    }

    public int hashCode() {
            r9 = this;
            int[] r0 = r9.f22810Y
            java.lang.Object[] r1 = r9.f22811Z
            int r2 = r9.f22812a0
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 0
        La:
            if (r5 >= r2) goto L1f
            r7 = r1[r3]
            r8 = r0[r5]
            if (r7 != 0) goto L14
            r7 = 0
            goto L18
        L14:
            int r7 = r7.hashCode()
        L18:
            r7 = r7 ^ r8
            int r6 = r6 + r7
            int r5 = r5 + 1
            int r3 = r3 + 2
            goto La
        L1f:
            return r6
    }

    /* renamed from: i */
    public void mo5829i(p319s.C5941h<? extends K, ? extends V> r5) {
            r4 = this;
            int r0 = r5.f22812a0
            int r1 = r4.f22812a0
            int r1 = r1 + r0
            r4.m12338b(r1)
            int r1 = r4.f22812a0
            r2 = 0
            if (r1 != 0) goto L22
            if (r0 <= 0) goto L32
            int[] r1 = r5.f22810Y
            int[] r3 = r4.f22810Y
            java.lang.System.arraycopy(r1, r2, r3, r2, r0)
            java.lang.Object[] r5 = r5.f22811Z
            java.lang.Object[] r1 = r4.f22811Z
            int r3 = r0 << 1
            java.lang.System.arraycopy(r5, r2, r1, r2, r3)
            r4.f22812a0 = r0
            goto L32
        L22:
            if (r2 >= r0) goto L32
            java.lang.Object r1 = r5.m12343h(r2)
            java.lang.Object r3 = r5.m12344l(r2)
            r4.put(r1, r3)
            int r2 = r2 + 1
            goto L22
        L32:
            return
    }

    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.f22812a0
            if (r0 > 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* renamed from: j */
    public V mo5830j(int r11) {
            r10 = this;
            java.lang.Object[] r0 = r10.f22811Z
            int r1 = r11 << 1
            int r2 = r1 + 1
            r2 = r0[r2]
            int r3 = r10.f22812a0
            r4 = 0
            r5 = 1
            if (r3 > r5) goto L1c
            int[] r11 = r10.f22810Y
            m12337c(r11, r0, r3)
            int[] r11 = p319s.C5937d.f22775a
            r10.f22810Y = r11
            java.lang.Object[] r11 = p319s.C5937d.f22777c
            r10.f22811Z = r11
            goto L79
        L1c:
            int r6 = r3 + (-1)
            int[] r7 = r10.f22810Y
            int r8 = r7.length
            r9 = 8
            if (r8 <= r9) goto L5e
            int r8 = r7.length
            int r8 = r8 / 3
            if (r3 >= r8) goto L5e
            if (r3 <= r9) goto L30
            int r8 = r3 >> 1
            int r9 = r3 + r8
        L30:
            r10.m12336a(r9)
            int r8 = r10.f22812a0
            if (r3 != r8) goto L58
            if (r11 <= 0) goto L43
            int[] r8 = r10.f22810Y
            java.lang.System.arraycopy(r7, r4, r8, r4, r11)
            java.lang.Object[] r8 = r10.f22811Z
            java.lang.System.arraycopy(r0, r4, r8, r4, r1)
        L43:
            if (r11 >= r6) goto L78
            int r4 = r11 + 1
            int[] r8 = r10.f22810Y
            int r9 = r6 - r11
            java.lang.System.arraycopy(r7, r4, r8, r11, r9)
            int r11 = r4 << 1
            java.lang.Object[] r4 = r10.f22811Z
            int r5 = r9 << 1
            java.lang.System.arraycopy(r0, r11, r4, r1, r5)
            goto L78
        L58:
            java.util.ConcurrentModificationException r11 = new java.util.ConcurrentModificationException
            r11.<init>()
            throw r11
        L5e:
            if (r11 >= r6) goto L6e
            int r0 = r11 + 1
            int r4 = r6 - r11
            java.lang.System.arraycopy(r7, r0, r7, r11, r4)
            java.lang.Object[] r11 = r10.f22811Z
            int r0 = r0 << r5
            int r4 = r4 << r5
            java.lang.System.arraycopy(r11, r0, r11, r1, r4)
        L6e:
            java.lang.Object[] r11 = r10.f22811Z
            int r0 = r6 << 1
            r1 = 0
            r11[r0] = r1
            int r0 = r0 + r5
            r11[r0] = r1
        L78:
            r4 = r6
        L79:
            int r11 = r10.f22812a0
            if (r3 != r11) goto L80
            r10.f22812a0 = r4
            return r2
        L80:
            java.util.ConcurrentModificationException r11 = new java.util.ConcurrentModificationException
            r11.<init>()
            throw r11
    }

    /* renamed from: k */
    public V mo5831k(int r3, V r4) {
            r2 = this;
            int r3 = r3 << 1
            int r3 = r3 + 1
            java.lang.Object[] r0 = r2.f22811Z
            r1 = r0[r3]
            r0[r3] = r4
            return r1
    }

    /* renamed from: l */
    public V m12344l(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.f22811Z
            int r2 = r2 << 1
            int r2 = r2 + 1
            r2 = r0[r2]
            return r2
    }

    public V put(K r10, V r11) {
            r9 = this;
            int r0 = r9.f22812a0
            r1 = 0
            if (r10 != 0) goto Lb
            int r2 = r9.m12341f()
            r3 = 0
            goto L16
        Lb:
            int r2 = r10.hashCode()
            int r3 = r9.m12339d(r10, r2)
            r8 = r3
            r3 = r2
            r2 = r8
        L16:
            if (r2 < 0) goto L23
            int r10 = r2 << 1
            int r10 = r10 + 1
            java.lang.Object[] r0 = r9.f22811Z
            r1 = r0[r10]
            r0[r10] = r11
            return r1
        L23:
            int r2 = ~r2
            int[] r4 = r9.f22810Y
            int r5 = r4.length
            if (r0 < r5) goto L58
            r5 = 4
            r6 = 8
            if (r0 < r6) goto L32
            int r5 = r0 >> 1
            int r5 = r5 + r0
            goto L36
        L32:
            if (r0 < r5) goto L36
            r5 = 8
        L36:
            java.lang.Object[] r6 = r9.f22811Z
            r9.m12336a(r5)
            int r5 = r9.f22812a0
            if (r0 != r5) goto L52
            int[] r5 = r9.f22810Y
            int r7 = r5.length
            if (r7 <= 0) goto L4e
            int r7 = r4.length
            java.lang.System.arraycopy(r4, r1, r5, r1, r7)
            java.lang.Object[] r5 = r9.f22811Z
            int r7 = r6.length
            java.lang.System.arraycopy(r6, r1, r5, r1, r7)
        L4e:
            m12337c(r4, r6, r0)
            goto L58
        L52:
            java.util.ConcurrentModificationException r10 = new java.util.ConcurrentModificationException
            r10.<init>()
            throw r10
        L58:
            if (r2 >= r0) goto L71
            int[] r1 = r9.f22810Y
            int r4 = r2 + 1
            int r5 = r0 - r2
            java.lang.System.arraycopy(r1, r2, r1, r4, r5)
            java.lang.Object[] r1 = r9.f22811Z
            int r5 = r2 << 1
            int r4 = r4 << 1
            int r6 = r9.f22812a0
            int r6 = r6 - r2
            int r6 = r6 << 1
            java.lang.System.arraycopy(r1, r5, r1, r4, r6)
        L71:
            int r1 = r9.f22812a0
            if (r0 != r1) goto L8c
            int[] r0 = r9.f22810Y
            int r4 = r0.length
            if (r2 >= r4) goto L8c
            r0[r2] = r3
            java.lang.Object[] r0 = r9.f22811Z
            int r2 = r2 << 1
            r0[r2] = r10
            int r2 = r2 + 1
            r0[r2] = r11
            int r1 = r1 + 1
            r9.f22812a0 = r1
            r10 = 0
            return r10
        L8c:
            java.util.ConcurrentModificationException r10 = new java.util.ConcurrentModificationException
            r10.<init>()
            throw r10
    }

    public V putIfAbsent(K r2, V r3) {
            r1 = this;
            r0 = 0
            java.lang.Object r0 = r1.getOrDefault(r2, r0)
            if (r0 != 0) goto Lb
            java.lang.Object r0 = r1.put(r2, r3)
        Lb:
            return r0
    }

    public V remove(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.m12340e(r1)
            if (r1 < 0) goto Lb
            java.lang.Object r1 = r0.mo5830j(r1)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public boolean remove(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r2 = r1.m12340e(r2)
            if (r2 < 0) goto L19
            java.lang.Object r0 = r1.m12344l(r2)
            if (r3 == r0) goto L14
            if (r3 == 0) goto L19
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L19
        L14:
            r1.mo5830j(r2)
            r2 = 1
            return r2
        L19:
            r2 = 0
            return r2
    }

    public V replace(K r1, V r2) {
            r0 = this;
            int r1 = r0.m12340e(r1)
            if (r1 < 0) goto Lb
            java.lang.Object r1 = r0.mo5831k(r1, r2)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public boolean replace(K r2, V r3, V r4) {
            r1 = this;
            int r2 = r1.m12340e(r2)
            if (r2 < 0) goto L19
            java.lang.Object r0 = r1.m12344l(r2)
            if (r0 == r3) goto L14
            if (r3 == 0) goto L19
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L19
        L14:
            r1.mo5831k(r2, r4)
            r2 = 1
            return r2
        L19:
            r2 = 0
            return r2
    }

    public int size() {
            r1 = this;
            int r0 = r1.f22812a0
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.f22812a0
            int r1 = r1 * 28
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r1 = 0
        L18:
            int r2 = r4.f22812a0
            if (r1 >= r2) goto L47
            if (r1 <= 0) goto L23
            java.lang.String r2 = ", "
            r0.append(r2)
        L23:
            java.lang.Object r2 = r4.m12343h(r1)
            java.lang.String r3 = "(this Map)"
            if (r2 == r4) goto L2f
            r0.append(r2)
            goto L32
        L2f:
            r0.append(r3)
        L32:
            r2 = 61
            r0.append(r2)
            java.lang.Object r2 = r4.m12344l(r1)
            if (r2 == r4) goto L41
            r0.append(r2)
            goto L44
        L41:
            r0.append(r3)
        L44:
            int r1 = r1 + 1
            goto L18
        L47:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
