package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.l0 */
/* loaded from: classes.dex */
public class C0600l0 {

    /* renamed from: a */
    public final androidx.recyclerview.widget.C0600l0.b f3467a;

    /* renamed from: b */
    public androidx.recyclerview.widget.C0600l0.a f3468b;

    /* renamed from: androidx.recyclerview.widget.l0$a */
    public static class a {

        /* renamed from: a */
        public int f3469a;

        /* renamed from: b */
        public int f3470b;

        /* renamed from: c */
        public int f3471c;

        /* renamed from: d */
        public int f3472d;

        /* renamed from: e */
        public int f3473e;

        public a() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f3469a = r0
                return
        }

        /* renamed from: a */
        public boolean m2085a() {
                r4 = this;
                int r0 = r4.f3469a
                r1 = r0 & 7
                r2 = 0
                if (r1 == 0) goto L14
                int r1 = r4.f3472d
                int r3 = r4.f3470b
                int r1 = r4.m2086b(r1, r3)
                int r1 = r1 << r2
                r0 = r0 & r1
                if (r0 != 0) goto L14
                return r2
            L14:
                int r0 = r4.f3469a
                r1 = r0 & 112(0x70, float:1.57E-43)
                if (r1 == 0) goto L28
                int r1 = r4.f3472d
                int r3 = r4.f3471c
                int r1 = r4.m2086b(r1, r3)
                int r1 = r1 << 4
                r0 = r0 & r1
                if (r0 != 0) goto L28
                return r2
            L28:
                int r0 = r4.f3469a
                r1 = r0 & 1792(0x700, float:2.511E-42)
                if (r1 == 0) goto L3c
                int r1 = r4.f3473e
                int r3 = r4.f3470b
                int r1 = r4.m2086b(r1, r3)
                int r1 = r1 << 8
                r0 = r0 & r1
                if (r0 != 0) goto L3c
                return r2
            L3c:
                int r0 = r4.f3469a
                r1 = r0 & 28672(0x7000, float:4.0178E-41)
                if (r1 == 0) goto L50
                int r1 = r4.f3473e
                int r3 = r4.f3471c
                int r1 = r4.m2086b(r1, r3)
                int r1 = r1 << 12
                r0 = r0 & r1
                if (r0 != 0) goto L50
                return r2
            L50:
                r0 = 1
                return r0
        }

        /* renamed from: b */
        public int m2086b(int r1, int r2) {
                r0 = this;
                if (r1 <= r2) goto L4
                r1 = 1
                return r1
            L4:
                if (r1 != r2) goto L8
                r1 = 2
                return r1
            L8:
                r1 = 4
                return r1
        }
    }

    /* renamed from: androidx.recyclerview.widget.l0$b */
    public interface b {
        /* renamed from: a */
        int mo1892a();

        /* renamed from: b */
        int mo1893b(android.view.View r1);

        /* renamed from: c */
        android.view.View mo1894c(int r1);

        /* renamed from: d */
        int mo1895d();

        /* renamed from: e */
        int mo1896e(android.view.View r1);
    }

    public C0600l0(androidx.recyclerview.widget.C0600l0.b r1) {
            r0 = this;
            r0.<init>()
            r0.f3467a = r1
            androidx.recyclerview.widget.l0$a r1 = new androidx.recyclerview.widget.l0$a
            r1.<init>()
            r0.f3468b = r1
            return
    }

    /* renamed from: a */
    public android.view.View m2083a(int r9, int r10, int r11, int r12) {
            r8 = this;
            androidx.recyclerview.widget.l0$b r0 = r8.f3467a
            int r0 = r0.mo1895d()
            androidx.recyclerview.widget.l0$b r1 = r8.f3467a
            int r1 = r1.mo1892a()
            if (r10 <= r9) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = -1
        L11:
            r3 = 0
        L12:
            if (r9 == r10) goto L53
            androidx.recyclerview.widget.l0$b r4 = r8.f3467a
            android.view.View r4 = r4.mo1894c(r9)
            androidx.recyclerview.widget.l0$b r5 = r8.f3467a
            int r5 = r5.mo1893b(r4)
            androidx.recyclerview.widget.l0$b r6 = r8.f3467a
            int r6 = r6.mo1896e(r4)
            androidx.recyclerview.widget.l0$a r7 = r8.f3468b
            r7.f3470b = r0
            r7.f3471c = r1
            r7.f3472d = r5
            r7.f3473e = r6
            r5 = 0
            if (r11 == 0) goto L40
            r7.f3469a = r5
            r6 = r11 | 0
            r7.f3469a = r6
            boolean r6 = r7.m2085a()
            if (r6 == 0) goto L40
            return r4
        L40:
            if (r12 == 0) goto L51
            androidx.recyclerview.widget.l0$a r6 = r8.f3468b
            r6.f3469a = r5
            r5 = r12 | 0
            r6.f3469a = r5
            boolean r5 = r6.m2085a()
            if (r5 == 0) goto L51
            r3 = r4
        L51:
            int r9 = r9 + r2
            goto L12
        L53:
            return r3
    }

    /* renamed from: b */
    public boolean m2084b(android.view.View r6, int r7) {
            r5 = this;
            androidx.recyclerview.widget.l0$a r0 = r5.f3468b
            androidx.recyclerview.widget.l0$b r1 = r5.f3467a
            int r1 = r1.mo1895d()
            androidx.recyclerview.widget.l0$b r2 = r5.f3467a
            int r2 = r2.mo1892a()
            androidx.recyclerview.widget.l0$b r3 = r5.f3467a
            int r3 = r3.mo1893b(r6)
            androidx.recyclerview.widget.l0$b r4 = r5.f3467a
            int r6 = r4.mo1896e(r6)
            r0.f3470b = r1
            r0.f3471c = r2
            r0.f3472d = r3
            r0.f3473e = r6
            r6 = 0
            if (r7 == 0) goto L30
            androidx.recyclerview.widget.l0$a r0 = r5.f3468b
            r0.f3469a = r6
            r6 = r6 | r7
            r0.f3469a = r6
            boolean r6 = r0.m2085a()
        L30:
            return r6
    }
}
