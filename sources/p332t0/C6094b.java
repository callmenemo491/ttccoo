package p332t0;

/* renamed from: t0.b */
/* loaded from: classes.dex */
public class C6094b {

    /* renamed from: t0.b$a */
    public interface a<T> {
    }

    /* renamed from: t0.b$b */
    public interface b<T, V> {
    }

    /* renamed from: t0.b$c */
    public static class c<T> implements java.util.Comparator<T> {

        /* renamed from: Y */
        public final android.graphics.Rect f23516Y;

        /* renamed from: Z */
        public final android.graphics.Rect f23517Z;

        /* renamed from: a0 */
        public final boolean f23518a0;

        /* renamed from: b0 */
        public final p332t0.C6094b.a<T> f23519b0;

        public c(boolean r2, p332t0.C6094b.a<T> r3) {
                r1 = this;
                r1.<init>()
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.f23516Y = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.f23517Z = r0
                r1.f23518a0 = r2
                r1.f23519b0 = r3
                return
        }

        @Override // java.util.Comparator
        public int compare(T r5, T r6) {
                r4 = this;
                android.graphics.Rect r0 = r4.f23516Y
                android.graphics.Rect r1 = r4.f23517Z
                t0.b$a<T> r2 = r4.f23519b0
                t0.a$a r2 = (p332t0.AbstractC6093a.a) r2
                r2.m12561a(r5, r0)
                t0.b$a<T> r5 = r4.f23519b0
                t0.a$a r5 = (p332t0.AbstractC6093a.a) r5
                r5.m12561a(r6, r1)
                int r5 = r0.top
                int r6 = r1.top
                r2 = -1
                if (r5 >= r6) goto L1a
                return r2
            L1a:
                r3 = 1
                if (r5 <= r6) goto L1e
                return r3
            L1e:
                int r5 = r0.left
                int r6 = r1.left
                if (r5 >= r6) goto L2a
                boolean r5 = r4.f23518a0
                if (r5 == 0) goto L29
                r2 = 1
            L29:
                return r2
            L2a:
                if (r5 <= r6) goto L33
                boolean r5 = r4.f23518a0
                if (r5 == 0) goto L31
                goto L32
            L31:
                r2 = 1
            L32:
                return r2
            L33:
                int r5 = r0.bottom
                int r6 = r1.bottom
                if (r5 >= r6) goto L3a
                return r2
            L3a:
                if (r5 <= r6) goto L3d
                return r3
            L3d:
                int r5 = r0.right
                int r6 = r1.right
                if (r5 >= r6) goto L49
                boolean r5 = r4.f23518a0
                if (r5 == 0) goto L48
                r2 = 1
            L48:
                return r2
            L49:
                if (r5 <= r6) goto L52
                boolean r5 = r4.f23518a0
                if (r5 == 0) goto L50
                goto L51
            L50:
                r2 = 1
            L51:
                return r2
            L52:
                r5 = 0
                return r5
        }
    }

    /* renamed from: a */
    public static boolean m12562a(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
            boolean r0 = m12563b(r9, r10, r11)
            boolean r1 = m12563b(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L7d
            if (r0 != 0) goto Lf
            goto L7d
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3d
            if (r9 == r3) goto L36
            if (r9 == r4) goto L2f
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L45
            goto L43
        L29:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L2f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L45
            goto L43
        L36:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L45
            goto L43
        L3d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L45
        L43:
            r7 = 1
            goto L46
        L45:
            r7 = 0
        L46:
            if (r7 != 0) goto L49
            return r6
        L49:
            if (r9 == r5) goto L7c
            if (r9 != r4) goto L4e
            goto L7c
        L4e:
            int r11 = m12565d(r9, r10, r11)
            if (r9 == r5) goto L6f
            if (r9 == r3) goto L6a
            if (r9 == r4) goto L65
            if (r9 != r1) goto L5f
            int r9 = r12.bottom
            int r10 = r10.bottom
            goto L73
        L5f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L65:
            int r9 = r12.right
            int r10 = r10.right
            goto L73
        L6a:
            int r9 = r10.top
            int r10 = r12.top
            goto L73
        L6f:
            int r9 = r10.left
            int r10 = r12.left
        L73:
            int r9 = r9 - r10
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L7b
            r2 = 1
        L7b:
            return r2
        L7c:
            return r6
        L7d:
            return r2
    }

    /* renamed from: b */
    public static boolean m12563b(int r3, android.graphics.Rect r4, android.graphics.Rect r5) {
            r0 = 17
            r1 = 1
            r2 = 0
            if (r3 == r0) goto L2a
            r0 = 33
            if (r3 == r0) goto L1b
            r0 = 66
            if (r3 == r0) goto L2a
            r0 = 130(0x82, float:1.82E-43)
            if (r3 != r0) goto L13
            goto L1b
        L13:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r3.<init>(r4)
            throw r3
        L1b:
            int r3 = r5.right
            int r0 = r4.left
            if (r3 < r0) goto L28
            int r3 = r5.left
            int r4 = r4.right
            if (r3 > r4) goto L28
            goto L29
        L28:
            r1 = 0
        L29:
            return r1
        L2a:
            int r3 = r5.bottom
            int r0 = r4.top
            if (r3 < r0) goto L37
            int r3 = r5.top
            int r4 = r4.bottom
            if (r3 > r4) goto L37
            goto L38
        L37:
            r1 = 0
        L38:
            return r1
    }

    /* renamed from: c */
    public static boolean m12564c(android.graphics.Rect r3, android.graphics.Rect r4, int r5) {
            r0 = 17
            r1 = 1
            r2 = 0
            if (r5 == r0) goto L53
            r0 = 33
            if (r5 == r0) goto L40
            r0 = 66
            if (r5 == r0) goto L2d
            r0 = 130(0x82, float:1.82E-43)
            if (r5 != r0) goto L25
            int r5 = r3.top
            int r0 = r4.top
            if (r5 < r0) goto L1c
            int r5 = r3.bottom
            if (r5 > r0) goto L23
        L1c:
            int r3 = r3.bottom
            int r4 = r4.bottom
            if (r3 >= r4) goto L23
            goto L24
        L23:
            r1 = 0
        L24:
            return r1
        L25:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r3.<init>(r4)
            throw r3
        L2d:
            int r5 = r3.left
            int r0 = r4.left
            if (r5 < r0) goto L37
            int r5 = r3.right
            if (r5 > r0) goto L3e
        L37:
            int r3 = r3.right
            int r4 = r4.right
            if (r3 >= r4) goto L3e
            goto L3f
        L3e:
            r1 = 0
        L3f:
            return r1
        L40:
            int r5 = r3.bottom
            int r0 = r4.bottom
            if (r5 > r0) goto L4a
            int r5 = r3.top
            if (r5 < r0) goto L51
        L4a:
            int r3 = r3.top
            int r4 = r4.top
            if (r3 <= r4) goto L51
            goto L52
        L51:
            r1 = 0
        L52:
            return r1
        L53:
            int r5 = r3.right
            int r0 = r4.right
            if (r5 > r0) goto L5d
            int r5 = r3.left
            if (r5 < r0) goto L64
        L5d:
            int r3 = r3.left
            int r4 = r4.left
            if (r3 <= r4) goto L64
            goto L65
        L64:
            r1 = 0
        L65:
            return r1
    }

    /* renamed from: d */
    public static int m12565d(int r1, android.graphics.Rect r2, android.graphics.Rect r3) {
            r0 = 17
            if (r1 == r0) goto L27
            r0 = 33
            if (r1 == r0) goto L22
            r0 = 66
            if (r1 == r0) goto L1d
            r0 = 130(0x82, float:1.82E-43)
            if (r1 != r0) goto L15
            int r1 = r3.top
            int r2 = r2.bottom
            goto L2b
        L15:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L1d:
            int r1 = r3.left
            int r2 = r2.right
            goto L2b
        L22:
            int r1 = r2.top
            int r2 = r3.bottom
            goto L2b
        L27:
            int r1 = r2.left
            int r2 = r3.right
        L2b:
            int r1 = r1 - r2
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            return r1
    }

    /* renamed from: e */
    public static int m12566e(int r1, android.graphics.Rect r2, android.graphics.Rect r3) {
            r0 = 17
            if (r1 == r0) goto L29
            r0 = 33
            if (r1 == r0) goto L19
            r0 = 66
            if (r1 == r0) goto L29
            r0 = 130(0x82, float:1.82E-43)
            if (r1 != r0) goto L11
            goto L19
        L11:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L19:
            int r1 = r2.left
            int r2 = r2.width()
            int r2 = r2 / 2
            int r2 = r2 + r1
            int r1 = r3.left
            int r3 = r3.width()
            goto L38
        L29:
            int r1 = r2.top
            int r2 = r2.height()
            int r2 = r2 / 2
            int r2 = r2 + r1
            int r1 = r3.top
            int r3 = r3.height()
        L38:
            int r3 = r3 / 2
            int r3 = r3 + r1
            int r2 = r2 - r3
            int r1 = java.lang.Math.abs(r2)
            return r1
    }
}
