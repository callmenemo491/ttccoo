package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.r */
/* loaded from: classes.dex */
public final class RunnableC0607r implements java.lang.Runnable {

    /* renamed from: c0 */
    public static final java.lang.ThreadLocal<androidx.recyclerview.widget.RunnableC0607r> f3551c0 = null;

    /* renamed from: d0 */
    public static java.util.Comparator<androidx.recyclerview.widget.RunnableC0607r.c> f3552d0;

    /* renamed from: Y */
    public java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> f3553Y;

    /* renamed from: Z */
    public long f3554Z;

    /* renamed from: a0 */
    public long f3555a0;

    /* renamed from: b0 */
    public java.util.ArrayList<androidx.recyclerview.widget.RunnableC0607r.c> f3556b0;

    /* renamed from: androidx.recyclerview.widget.r$a */
    public class a implements java.util.Comparator<androidx.recyclerview.widget.RunnableC0607r.c> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public int compare(androidx.recyclerview.widget.RunnableC0607r.c r7, androidx.recyclerview.widget.RunnableC0607r.c r8) {
                r6 = this;
                androidx.recyclerview.widget.r$c r7 = (androidx.recyclerview.widget.RunnableC0607r.c) r7
                androidx.recyclerview.widget.r$c r8 = (androidx.recyclerview.widget.RunnableC0607r.c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.f3564d
                r1 = 1
                r2 = 0
                if (r0 != 0) goto Lc
                r3 = 1
                goto Ld
            Lc:
                r3 = 0
            Ld:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f3564d
                if (r4 != 0) goto L13
                r4 = 1
                goto L14
            L13:
                r4 = 0
            L14:
                r5 = -1
                if (r3 == r4) goto L1a
                if (r0 != 0) goto L22
                goto L23
            L1a:
                boolean r0 = r7.f3561a
                boolean r3 = r8.f3561a
                if (r0 == r3) goto L25
                if (r0 == 0) goto L23
            L22:
                r1 = -1
            L23:
                r2 = r1
                goto L36
            L25:
                int r0 = r8.f3562b
                int r1 = r7.f3562b
                int r0 = r0 - r1
                if (r0 == 0) goto L2e
                r2 = r0
                goto L36
            L2e:
                int r7 = r7.f3563c
                int r8 = r8.f3563c
                int r7 = r7 - r8
                if (r7 == 0) goto L36
                r2 = r7
            L36:
                return r2
        }
    }

    @android.annotation.SuppressLint({"VisibleForTests"})
    /* renamed from: androidx.recyclerview.widget.r$b */
    public static class b implements androidx.recyclerview.widget.RecyclerView.AbstractC0557m.c {

        /* renamed from: a */
        public int f3557a;

        /* renamed from: b */
        public int f3558b;

        /* renamed from: c */
        public int[] f3559c;

        /* renamed from: d */
        public int f3560d;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public void m2114a(int r6, int r7) {
                r5 = this;
                if (r6 < 0) goto L3b
                if (r7 < 0) goto L33
                int r0 = r5.f3560d
                int r0 = r0 * 2
                int[] r1 = r5.f3559c
                if (r1 != 0) goto L16
                r1 = 4
                int[] r1 = new int[r1]
                r5.f3559c = r1
                r2 = -1
                java.util.Arrays.fill(r1, r2)
                goto L24
            L16:
                int r2 = r1.length
                if (r0 < r2) goto L24
                int r2 = r0 * 2
                int[] r2 = new int[r2]
                r5.f3559c = r2
                int r3 = r1.length
                r4 = 0
                java.lang.System.arraycopy(r1, r4, r2, r4, r3)
            L24:
                int[] r1 = r5.f3559c
                r1[r0] = r6
                int r0 = r0 + 1
                r1[r0] = r7
                int r6 = r5.f3560d
                int r6 = r6 + 1
                r5.f3560d = r6
                return
            L33:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "Pixel distance must be non-negative"
                r6.<init>(r7)
                throw r6
            L3b:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "Layout positions must be non-negative"
                r6.<init>(r7)
                throw r6
        }

        /* renamed from: b */
        public void m2115b(androidx.recyclerview.widget.RecyclerView r5, boolean r6) {
                r4 = this;
                r0 = 0
                r4.f3560d = r0
                int[] r0 = r4.f3559c
                if (r0 == 0) goto Lb
                r1 = -1
                java.util.Arrays.fill(r0, r1)
            Lb:
                androidx.recyclerview.widget.RecyclerView$m r0 = r5.f3172m0
                androidx.recyclerview.widget.RecyclerView$e r1 = r5.f3170l0
                if (r1 == 0) goto L49
                if (r0 == 0) goto L49
                boolean r1 = r0.f3248i
                if (r1 == 0) goto L49
                if (r6 == 0) goto L2b
                androidx.recyclerview.widget.a r1 = r5.f3154d0
                boolean r1 = r1.m1990g()
                if (r1 != 0) goto L3a
                androidx.recyclerview.widget.RecyclerView$e r1 = r5.f3170l0
                int r1 = r1.mo1521b()
                r0.mo1693l(r1, r4)
                goto L3a
            L2b:
                boolean r1 = r5.m1735N()
                if (r1 != 0) goto L3a
                int r1 = r4.f3557a
                int r2 = r4.f3558b
                androidx.recyclerview.widget.RecyclerView$y r3 = r5.f3157e1
                r0.mo1691k(r1, r2, r3, r4)
            L3a:
                int r1 = r4.f3560d
                int r2 = r0.f3249j
                if (r1 <= r2) goto L49
                r0.f3249j = r1
                r0.f3250k = r6
                androidx.recyclerview.widget.RecyclerView$t r5 = r5.f3150b0
                r5.m1920l()
            L49:
                return
        }

        /* renamed from: c */
        public boolean m2116c(int r5) {
                r4 = this;
                int[] r0 = r4.f3559c
                r1 = 0
                if (r0 == 0) goto L17
                int r0 = r4.f3560d
                int r0 = r0 * 2
                r2 = 0
            La:
                if (r2 >= r0) goto L17
                int[] r3 = r4.f3559c
                r3 = r3[r2]
                if (r3 != r5) goto L14
                r5 = 1
                return r5
            L14:
                int r2 = r2 + 2
                goto La
            L17:
                return r1
        }
    }

    /* renamed from: androidx.recyclerview.widget.r$c */
    public static class c {

        /* renamed from: a */
        public boolean f3561a;

        /* renamed from: b */
        public int f3562b;

        /* renamed from: c */
        public int f3563c;

        /* renamed from: d */
        public androidx.recyclerview.widget.RecyclerView f3564d;

        /* renamed from: e */
        public int f3565e;

        public c() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.recyclerview.widget.RunnableC0607r.f3551c0 = r0
            androidx.recyclerview.widget.r$a r0 = new androidx.recyclerview.widget.r$a
            r0.<init>()
            androidx.recyclerview.widget.RunnableC0607r.f3552d0 = r0
            return
    }

    public RunnableC0607r() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3553Y = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3556b0 = r0
            return
    }

    /* renamed from: a */
    public void m2111a(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
            r5 = this;
            boolean r0 = r6.isAttachedToWindow()
            if (r0 == 0) goto L17
            long r0 = r5.f3554Z
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L17
            long r0 = r6.getNanoTime()
            r5.f3554Z = r0
            r6.post(r5)
        L17:
            androidx.recyclerview.widget.r$b r6 = r6.f3155d1
            r6.f3557a = r7
            r6.f3558b = r8
            return
    }

    /* renamed from: b */
    public void m2112b(long r14) {
            r13 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r13.f3553Y
            int r0 = r0.size()
            r1 = 0
            r2 = 0
            r3 = 0
        L9:
            if (r2 >= r0) goto L26
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r4 = r13.f3553Y
            java.lang.Object r4 = r4.get(r2)
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            int r5 = r4.getWindowVisibility()
            if (r5 != 0) goto L23
            androidx.recyclerview.widget.r$b r5 = r4.f3155d1
            r5.m2115b(r4, r1)
            androidx.recyclerview.widget.r$b r4 = r4.f3155d1
            int r4 = r4.f3560d
            int r3 = r3 + r4
        L23:
            int r2 = r2 + 1
            goto L9
        L26:
            java.util.ArrayList<androidx.recyclerview.widget.r$c> r2 = r13.f3556b0
            r2.ensureCapacity(r3)
            r2 = 0
            r3 = 0
        L2d:
            r4 = 1
            if (r2 >= r0) goto L8f
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r5 = r13.f3553Y
            java.lang.Object r5 = r5.get(r2)
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            int r6 = r5.getWindowVisibility()
            if (r6 == 0) goto L3f
            goto L8c
        L3f:
            androidx.recyclerview.widget.r$b r6 = r5.f3155d1
            int r7 = r6.f3557a
            int r7 = java.lang.Math.abs(r7)
            int r8 = r6.f3558b
            int r8 = java.lang.Math.abs(r8)
            int r8 = r8 + r7
            r7 = 0
        L4f:
            int r9 = r6.f3560d
            int r9 = r9 * 2
            if (r7 >= r9) goto L8c
            java.util.ArrayList<androidx.recyclerview.widget.r$c> r9 = r13.f3556b0
            int r9 = r9.size()
            if (r3 < r9) goto L68
            androidx.recyclerview.widget.r$c r9 = new androidx.recyclerview.widget.r$c
            r9.<init>()
            java.util.ArrayList<androidx.recyclerview.widget.r$c> r10 = r13.f3556b0
            r10.add(r9)
            goto L70
        L68:
            java.util.ArrayList<androidx.recyclerview.widget.r$c> r9 = r13.f3556b0
            java.lang.Object r9 = r9.get(r3)
            androidx.recyclerview.widget.r$c r9 = (androidx.recyclerview.widget.RunnableC0607r.c) r9
        L70:
            int[] r10 = r6.f3559c
            int r11 = r7 + 1
            r11 = r10[r11]
            if (r11 > r8) goto L7a
            r12 = 1
            goto L7b
        L7a:
            r12 = 0
        L7b:
            r9.f3561a = r12
            r9.f3562b = r8
            r9.f3563c = r11
            r9.f3564d = r5
            r10 = r10[r7]
            r9.f3565e = r10
            int r3 = r3 + 1
            int r7 = r7 + 2
            goto L4f
        L8c:
            int r2 = r2 + 1
            goto L2d
        L8f:
            java.util.ArrayList<androidx.recyclerview.widget.r$c> r0 = r13.f3556b0
            java.util.Comparator<androidx.recyclerview.widget.r$c> r2 = androidx.recyclerview.widget.RunnableC0607r.f3552d0
            java.util.Collections.sort(r0, r2)
            r0 = 0
        L97:
            java.util.ArrayList<androidx.recyclerview.widget.r$c> r2 = r13.f3556b0
            int r2 = r2.size()
            if (r0 >= r2) goto L137
            java.util.ArrayList<androidx.recyclerview.widget.r$c> r2 = r13.f3556b0
            java.lang.Object r2 = r2.get(r0)
            androidx.recyclerview.widget.r$c r2 = (androidx.recyclerview.widget.RunnableC0607r.c) r2
            androidx.recyclerview.widget.RecyclerView r3 = r2.f3564d
            if (r3 != 0) goto Lad
            goto L137
        Lad:
            boolean r5 = r2.f3561a
            if (r5 == 0) goto Lb7
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto Lb8
        Lb7:
            r5 = r14
        Lb8:
            int r7 = r2.f3565e
            androidx.recyclerview.widget.RecyclerView$b0 r3 = r13.m2113c(r3, r7, r5)
            if (r3 == 0) goto L128
            java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> r5 = r3.f3209b
            if (r5 == 0) goto L128
            boolean r5 = r3.m1794k()
            if (r5 == 0) goto L128
            boolean r5 = r3.m1795l()
            if (r5 != 0) goto L128
            java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> r3 = r3.f3209b
            java.lang.Object r3 = r3.get()
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            if (r3 != 0) goto Ldb
            goto L128
        Ldb:
            boolean r5 = r3.f3125D0
            if (r5 == 0) goto Lea
            androidx.recyclerview.widget.h r5 = r3.f3156e0
            int r5 = r5.m2049h()
            if (r5 == 0) goto Lea
            r3.m1748a0()
        Lea:
            androidx.recyclerview.widget.r$b r5 = r3.f3155d1
            r5.m2115b(r3, r4)
            int r6 = r5.f3560d
            if (r6 == 0) goto L128
            java.lang.String r6 = "RV Nested Prefetch"
            int r7 = p158j0.C3386h.f14543a     // Catch: java.lang.Throwable -> L121
            android.os.Trace.beginSection(r6)     // Catch: java.lang.Throwable -> L121
            androidx.recyclerview.widget.RecyclerView$y r6 = r3.f3157e1     // Catch: java.lang.Throwable -> L121
            androidx.recyclerview.widget.RecyclerView$e r7 = r3.f3170l0     // Catch: java.lang.Throwable -> L121
            r6.f3299d = r4     // Catch: java.lang.Throwable -> L121
            int r7 = r7.mo1521b()     // Catch: java.lang.Throwable -> L121
            r6.f3300e = r7     // Catch: java.lang.Throwable -> L121
            r6.f3302g = r1     // Catch: java.lang.Throwable -> L121
            r6.f3303h = r1     // Catch: java.lang.Throwable -> L121
            r6.f3304i = r1     // Catch: java.lang.Throwable -> L121
            r6 = 0
        L10d:
            int r7 = r5.f3560d     // Catch: java.lang.Throwable -> L121
            int r7 = r7 * 2
            if (r6 >= r7) goto L11d
            int[] r7 = r5.f3559c     // Catch: java.lang.Throwable -> L121
            r7 = r7[r6]     // Catch: java.lang.Throwable -> L121
            r13.m2113c(r3, r7, r14)     // Catch: java.lang.Throwable -> L121
            int r6 = r6 + 2
            goto L10d
        L11d:
            android.os.Trace.endSection()
            goto L128
        L121:
            r14 = move-exception
            int r15 = p158j0.C3386h.f14543a
            android.os.Trace.endSection()
            throw r14
        L128:
            r2.f3561a = r1
            r2.f3562b = r1
            r2.f3563c = r1
            r3 = 0
            r2.f3564d = r3
            r2.f3565e = r1
            int r0 = r0 + 1
            goto L97
        L137:
            return
    }

    /* renamed from: c */
    public final androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 m2113c(androidx.recyclerview.widget.RecyclerView r6, int r7, long r8) {
            r5 = this;
            androidx.recyclerview.widget.h r0 = r6.f3156e0
            int r0 = r0.m2049h()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L23
            androidx.recyclerview.widget.h r3 = r6.f3156e0
            android.view.View r3 = r3.m2048g(r2)
            androidx.recyclerview.widget.RecyclerView$b0 r3 = androidx.recyclerview.widget.RecyclerView.m1716K(r3)
            int r4 = r3.f3210c
            if (r4 != r7) goto L20
            boolean r3 = r3.m1795l()
            if (r3 != 0) goto L20
            r0 = 1
            goto L24
        L20:
            int r2 = r2 + 1
            goto L8
        L23:
            r0 = 0
        L24:
            if (r0 == 0) goto L28
            r6 = 0
            return r6
        L28:
            androidx.recyclerview.widget.RecyclerView$t r0 = r6.f3150b0
            r6.m1741T()     // Catch: java.lang.Throwable -> L4c
            androidx.recyclerview.widget.RecyclerView$b0 r7 = r0.m1918j(r7, r1, r8)     // Catch: java.lang.Throwable -> L4c
            if (r7 == 0) goto L48
            boolean r8 = r7.m1794k()     // Catch: java.lang.Throwable -> L4c
            if (r8 == 0) goto L45
            boolean r8 = r7.m1795l()     // Catch: java.lang.Throwable -> L4c
            if (r8 != 0) goto L45
            android.view.View r8 = r7.f3208a     // Catch: java.lang.Throwable -> L4c
            r0.m1915g(r8)     // Catch: java.lang.Throwable -> L4c
            goto L48
        L45:
            r0.m1909a(r7, r1)     // Catch: java.lang.Throwable -> L4c
        L48:
            r6.m1742U(r1)
            return r7
        L4c:
            r7 = move-exception
            r6.m1742U(r1)
            throw r7
    }

    @Override // java.lang.Runnable
    public void run() {
            r8 = this;
            r0 = 0
            java.lang.String r2 = "RV Prefetch"
            int r3 = p158j0.C3386h.f14543a     // Catch: java.lang.Throwable -> L56
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Throwable -> L56
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r2 = r8.f3553Y     // Catch: java.lang.Throwable -> L56
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L17
            r8.f3554Z = r0
            android.os.Trace.endSection()
            return
        L17:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r2 = r8.f3553Y     // Catch: java.lang.Throwable -> L56
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L56
            r3 = 0
            r4 = r0
        L1f:
            if (r3 >= r2) goto L3a
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r6 = r8.f3553Y     // Catch: java.lang.Throwable -> L56
            java.lang.Object r6 = r6.get(r3)     // Catch: java.lang.Throwable -> L56
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6     // Catch: java.lang.Throwable -> L56
            int r7 = r6.getWindowVisibility()     // Catch: java.lang.Throwable -> L56
            if (r7 != 0) goto L37
            long r6 = r6.getDrawingTime()     // Catch: java.lang.Throwable -> L56
            long r4 = java.lang.Math.max(r6, r4)     // Catch: java.lang.Throwable -> L56
        L37:
            int r3 = r3 + 1
            goto L1f
        L3a:
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L44
            r8.f3554Z = r0
            android.os.Trace.endSection()
            return
        L44:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L56
            long r2 = r2.toNanos(r4)     // Catch: java.lang.Throwable -> L56
            long r4 = r8.f3555a0     // Catch: java.lang.Throwable -> L56
            long r2 = r2 + r4
            r8.m2112b(r2)     // Catch: java.lang.Throwable -> L56
            r8.f3554Z = r0
            android.os.Trace.endSection()
            return
        L56:
            r2 = move-exception
            r8.f3554Z = r0
            int r0 = p158j0.C3386h.f14543a
            android.os.Trace.endSection()
            throw r2
    }
}
