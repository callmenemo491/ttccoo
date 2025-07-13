package p195l0;

/* renamed from: l0.d */
/* loaded from: classes.dex */
public final class C4160d {

    /* renamed from: a */
    public static final p195l0.InterfaceC4159c f17233a = null;

    /* renamed from: b */
    public static final p195l0.InterfaceC4159c f17234b = null;

    /* renamed from: c */
    public static final p195l0.InterfaceC4159c f17235c = null;

    /* renamed from: d */
    public static final p195l0.InterfaceC4159c f17236d = null;

    /* renamed from: l0.d$a */
    public static class a implements p195l0.C4160d.b {

        /* renamed from: a */
        public static final p195l0.C4160d.a f17237a = null;

        static {
                l0.d$a r0 = new l0.d$a
                r0.<init>()
                p195l0.C4160d.a.f17237a = r0
                return
        }

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p195l0.C4160d.b
        /* renamed from: a */
        public int mo9219a(java.lang.CharSequence r4, int r5, int r6) {
                r3 = this;
                int r6 = r6 + r5
                r0 = 2
                r1 = 2
            L3:
                if (r5 >= r6) goto L23
                if (r1 != r0) goto L23
                char r1 = r4.charAt(r5)
                byte r1 = java.lang.Character.getDirectionality(r1)
                l0.c r2 = p195l0.C4160d.f17233a
                r2 = 1
                if (r1 == 0) goto L1f
                if (r1 == r2) goto L1d
                if (r1 == r0) goto L1d
                switch(r1) {
                    case 14: goto L1f;
                    case 15: goto L1f;
                    case 16: goto L1d;
                    case 17: goto L1d;
                    default: goto L1b;
                }
            L1b:
                r1 = 2
                goto L20
            L1d:
                r1 = 0
                goto L20
            L1f:
                r1 = 1
            L20:
                int r5 = r5 + 1
                goto L3
            L23:
                return r1
        }
    }

    /* renamed from: l0.d$b */
    public interface b {
        /* renamed from: a */
        int mo9219a(java.lang.CharSequence r1, int r2, int r3);
    }

    /* renamed from: l0.d$c */
    public static abstract class c implements p195l0.InterfaceC4159c {

        /* renamed from: a */
        public final p195l0.C4160d.b f17238a;

        public c(p195l0.C4160d.b r1) {
                r0 = this;
                r0.<init>()
                r0.f17238a = r1
                return
        }

        /* renamed from: a */
        public abstract boolean mo9220a();

        /* renamed from: b */
        public boolean m9221b(java.lang.CharSequence r2, int r3, int r4) {
                r1 = this;
                if (r3 < 0) goto L24
                if (r4 < 0) goto L24
                int r0 = r2.length()
                int r0 = r0 - r4
                if (r0 < r3) goto L24
                l0.d$b r0 = r1.f17238a
                if (r0 != 0) goto L14
                boolean r2 = r1.mo9220a()
                return r2
            L14:
                int r2 = r0.mo9219a(r2, r3, r4)
                r3 = 1
                if (r2 == 0) goto L23
                if (r2 == r3) goto L22
                boolean r3 = r1.mo9220a()
                goto L23
            L22:
                r3 = 0
            L23:
                return r3
            L24:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                r2.<init>()
                throw r2
        }
    }

    /* renamed from: l0.d$d */
    public static class d extends p195l0.C4160d.c {

        /* renamed from: b */
        public final boolean f17239b;

        public d(p195l0.C4160d.b r1, boolean r2) {
                r0 = this;
                r0.<init>(r1)
                r0.f17239b = r2
                return
        }

        @Override // p195l0.C4160d.c
        /* renamed from: a */
        public boolean mo9220a() {
                r1 = this;
                boolean r0 = r1.f17239b
                return r0
        }
    }

    static {
            l0.d$d r0 = new l0.d$d
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2)
            p195l0.C4160d.f17233a = r0
            l0.d$d r0 = new l0.d$d
            r3 = 1
            r0.<init>(r1, r3)
            p195l0.C4160d.f17234b = r0
            l0.d$d r0 = new l0.d$d
            l0.d$a r1 = p195l0.C4160d.a.f17237a
            r0.<init>(r1, r2)
            p195l0.C4160d.f17235c = r0
            l0.d$d r0 = new l0.d$d
            r0.<init>(r1, r3)
            p195l0.C4160d.f17236d = r0
            return
    }
}
