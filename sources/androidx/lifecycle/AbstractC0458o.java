package androidx.lifecycle;

/* renamed from: androidx.lifecycle.o */
/* loaded from: classes.dex */
public abstract class AbstractC0458o {

    /* renamed from: a */
    public java.util.concurrent.atomic.AtomicReference<java.lang.Object> f2543a;

    /* renamed from: androidx.lifecycle.o$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2544a = null;

        /* renamed from: b */
        public static final /* synthetic */ int[] f2545b = null;

        static {
                androidx.lifecycle.o$b[] r0 = androidx.lifecycle.AbstractC0458o.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.lifecycle.AbstractC0458o.a.f2545b = r0
                r1 = 1
                androidx.lifecycle.o$b r2 = androidx.lifecycle.AbstractC0458o.b.ON_CREATE     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = androidx.lifecycle.AbstractC0458o.a.f2545b     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.lifecycle.o$b r3 = androidx.lifecycle.AbstractC0458o.b.ON_STOP     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = androidx.lifecycle.AbstractC0458o.a.f2545b     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.lifecycle.o$b r4 = androidx.lifecycle.AbstractC0458o.b.ON_START     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                r3 = 4
                int[] r4 = androidx.lifecycle.AbstractC0458o.a.f2545b     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.lifecycle.o$b r5 = androidx.lifecycle.AbstractC0458o.b.ON_PAUSE     // Catch: java.lang.NoSuchFieldError -> L33
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                r4 = 5
                int[] r5 = androidx.lifecycle.AbstractC0458o.a.f2545b     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.lifecycle.o$b r6 = androidx.lifecycle.AbstractC0458o.b.ON_RESUME     // Catch: java.lang.NoSuchFieldError -> L3e
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r5[r6] = r4     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r5 = androidx.lifecycle.AbstractC0458o.a.f2545b     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.lifecycle.o$b r6 = androidx.lifecycle.AbstractC0458o.b.ON_DESTROY     // Catch: java.lang.NoSuchFieldError -> L49
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r7 = 6
                r5[r6] = r7     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r5 = androidx.lifecycle.AbstractC0458o.a.f2545b     // Catch: java.lang.NoSuchFieldError -> L54
                androidx.lifecycle.o$b r6 = androidx.lifecycle.AbstractC0458o.b.ON_ANY     // Catch: java.lang.NoSuchFieldError -> L54
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r7 = 7
                r5[r6] = r7     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                androidx.lifecycle.o$c[] r5 = androidx.lifecycle.AbstractC0458o.c.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                androidx.lifecycle.AbstractC0458o.a.f2544a = r5
                r5[r0] = r1     // Catch: java.lang.NoSuchFieldError -> L5f
            L5f:
                int[] r5 = androidx.lifecycle.AbstractC0458o.a.f2544a     // Catch: java.lang.NoSuchFieldError -> L63
                r5[r2] = r0     // Catch: java.lang.NoSuchFieldError -> L63
            L63:
                int[] r0 = androidx.lifecycle.AbstractC0458o.a.f2544a     // Catch: java.lang.NoSuchFieldError -> L67
                r0[r3] = r2     // Catch: java.lang.NoSuchFieldError -> L67
            L67:
                int[] r0 = androidx.lifecycle.AbstractC0458o.a.f2544a     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 0
                r0[r2] = r3     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = androidx.lifecycle.AbstractC0458o.a.f2544a     // Catch: java.lang.NoSuchFieldError -> L70
                r0[r1] = r4     // Catch: java.lang.NoSuchFieldError -> L70
            L70:
                return
        }
    }

    /* renamed from: androidx.lifecycle.o$b */
    public enum b extends java.lang.Enum<androidx.lifecycle.AbstractC0458o.b> {
        private static final /* synthetic */ androidx.lifecycle.AbstractC0458o.b[] $VALUES = null;
        public static final androidx.lifecycle.AbstractC0458o.b ON_ANY = null;
        public static final androidx.lifecycle.AbstractC0458o.b ON_CREATE = null;
        public static final androidx.lifecycle.AbstractC0458o.b ON_DESTROY = null;
        public static final androidx.lifecycle.AbstractC0458o.b ON_PAUSE = null;
        public static final androidx.lifecycle.AbstractC0458o.b ON_RESUME = null;
        public static final androidx.lifecycle.AbstractC0458o.b ON_START = null;
        public static final androidx.lifecycle.AbstractC0458o.b ON_STOP = null;

        static {
                androidx.lifecycle.o$b r0 = new androidx.lifecycle.o$b
                java.lang.String r1 = "ON_CREATE"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.lifecycle.AbstractC0458o.b.ON_CREATE = r0
                androidx.lifecycle.o$b r1 = new androidx.lifecycle.o$b
                java.lang.String r3 = "ON_START"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.lifecycle.AbstractC0458o.b.ON_START = r1
                androidx.lifecycle.o$b r3 = new androidx.lifecycle.o$b
                java.lang.String r5 = "ON_RESUME"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.lifecycle.AbstractC0458o.b.ON_RESUME = r3
                androidx.lifecycle.o$b r5 = new androidx.lifecycle.o$b
                java.lang.String r7 = "ON_PAUSE"
                r8 = 3
                r5.<init>(r7, r8)
                androidx.lifecycle.AbstractC0458o.b.ON_PAUSE = r5
                androidx.lifecycle.o$b r7 = new androidx.lifecycle.o$b
                java.lang.String r9 = "ON_STOP"
                r10 = 4
                r7.<init>(r9, r10)
                androidx.lifecycle.AbstractC0458o.b.ON_STOP = r7
                androidx.lifecycle.o$b r9 = new androidx.lifecycle.o$b
                java.lang.String r11 = "ON_DESTROY"
                r12 = 5
                r9.<init>(r11, r12)
                androidx.lifecycle.AbstractC0458o.b.ON_DESTROY = r9
                androidx.lifecycle.o$b r11 = new androidx.lifecycle.o$b
                java.lang.String r13 = "ON_ANY"
                r14 = 6
                r11.<init>(r13, r14)
                androidx.lifecycle.AbstractC0458o.b.ON_ANY = r11
                r13 = 7
                androidx.lifecycle.o$b[] r13 = new androidx.lifecycle.AbstractC0458o.b[r13]
                r13[r2] = r0
                r13[r4] = r1
                r13[r6] = r3
                r13[r8] = r5
                r13[r10] = r7
                r13[r12] = r9
                r13[r14] = r11
                androidx.lifecycle.AbstractC0458o.b.$VALUES = r13
                return
        }

        b(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* renamed from: g */
        public static androidx.lifecycle.AbstractC0458o.b m1456g(androidx.lifecycle.AbstractC0458o.c r1) {
                int r1 = r1.ordinal()
                r0 = 1
                if (r1 == r0) goto L15
                r0 = 2
                if (r1 == r0) goto L12
                r0 = 3
                if (r1 == r0) goto Lf
                r1 = 0
                return r1
            Lf:
                androidx.lifecycle.o$b r1 = androidx.lifecycle.AbstractC0458o.b.ON_RESUME
                return r1
            L12:
                androidx.lifecycle.o$b r1 = androidx.lifecycle.AbstractC0458o.b.ON_START
                return r1
            L15:
                androidx.lifecycle.o$b r1 = androidx.lifecycle.AbstractC0458o.b.ON_CREATE
                return r1
        }

        public static androidx.lifecycle.AbstractC0458o.b valueOf(java.lang.String r1) {
                java.lang.Class<androidx.lifecycle.o$b> r0 = androidx.lifecycle.AbstractC0458o.b.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.lifecycle.o$b r1 = (androidx.lifecycle.AbstractC0458o.b) r1
                return r1
        }

        public static androidx.lifecycle.AbstractC0458o.b[] values() {
                androidx.lifecycle.o$b[] r0 = androidx.lifecycle.AbstractC0458o.b.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.lifecycle.o$b[] r0 = (androidx.lifecycle.AbstractC0458o.b[]) r0
                return r0
        }

        /* renamed from: e */
        public androidx.lifecycle.AbstractC0458o.c m1457e() {
                r3 = this;
                int[] r0 = androidx.lifecycle.AbstractC0458o.a.f2545b
                int r1 = r3.ordinal()
                r0 = r0[r1]
                switch(r0) {
                    case 1: goto L2b;
                    case 2: goto L2b;
                    case 3: goto L28;
                    case 4: goto L28;
                    case 5: goto L25;
                    case 6: goto L22;
                    default: goto Lb;
                }
            Lb:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r2 = " has no target state"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L22:
                androidx.lifecycle.o$c r0 = androidx.lifecycle.AbstractC0458o.c.f2546Y
                return r0
            L25:
                androidx.lifecycle.o$c r0 = androidx.lifecycle.AbstractC0458o.c.f2550c0
                return r0
            L28:
                androidx.lifecycle.o$c r0 = androidx.lifecycle.AbstractC0458o.c.f2549b0
                return r0
            L2b:
                androidx.lifecycle.o$c r0 = androidx.lifecycle.AbstractC0458o.c.f2548a0
                return r0
        }
    }

    /* renamed from: androidx.lifecycle.o$c */
    public enum c extends java.lang.Enum<androidx.lifecycle.AbstractC0458o.c> {

        /* renamed from: Y */
        public static final androidx.lifecycle.AbstractC0458o.c f2546Y = null;

        /* renamed from: Z */
        public static final androidx.lifecycle.AbstractC0458o.c f2547Z = null;

        /* renamed from: a0 */
        public static final androidx.lifecycle.AbstractC0458o.c f2548a0 = null;

        /* renamed from: b0 */
        public static final androidx.lifecycle.AbstractC0458o.c f2549b0 = null;

        /* renamed from: c0 */
        public static final androidx.lifecycle.AbstractC0458o.c f2550c0 = null;

        /* renamed from: d0 */
        public static final /* synthetic */ androidx.lifecycle.AbstractC0458o.c[] f2551d0 = null;

        static {
                androidx.lifecycle.o$c r0 = new androidx.lifecycle.o$c
                java.lang.String r1 = "DESTROYED"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.lifecycle.AbstractC0458o.c.f2546Y = r0
                androidx.lifecycle.o$c r1 = new androidx.lifecycle.o$c
                java.lang.String r3 = "INITIALIZED"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.lifecycle.AbstractC0458o.c.f2547Z = r1
                androidx.lifecycle.o$c r3 = new androidx.lifecycle.o$c
                java.lang.String r5 = "CREATED"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.lifecycle.AbstractC0458o.c.f2548a0 = r3
                androidx.lifecycle.o$c r5 = new androidx.lifecycle.o$c
                java.lang.String r7 = "STARTED"
                r8 = 3
                r5.<init>(r7, r8)
                androidx.lifecycle.AbstractC0458o.c.f2549b0 = r5
                androidx.lifecycle.o$c r7 = new androidx.lifecycle.o$c
                java.lang.String r9 = "RESUMED"
                r10 = 4
                r7.<init>(r9, r10)
                androidx.lifecycle.AbstractC0458o.c.f2550c0 = r7
                r9 = 5
                androidx.lifecycle.o$c[] r9 = new androidx.lifecycle.AbstractC0458o.c[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                androidx.lifecycle.AbstractC0458o.c.f2551d0 = r9
                return
        }

        c(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.lifecycle.AbstractC0458o.c valueOf(java.lang.String r1) {
                java.lang.Class<androidx.lifecycle.o$c> r0 = androidx.lifecycle.AbstractC0458o.c.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.lifecycle.o$c r1 = (androidx.lifecycle.AbstractC0458o.c) r1
                return r1
        }

        public static androidx.lifecycle.AbstractC0458o.c[] values() {
                androidx.lifecycle.o$c[] r0 = androidx.lifecycle.AbstractC0458o.c.f2551d0
                java.lang.Object r0 = r0.clone()
                androidx.lifecycle.o$c[] r0 = (androidx.lifecycle.AbstractC0458o.c[]) r0
                return r0
        }
    }

    public AbstractC0458o() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.f2543a = r0
            return
    }

    /* renamed from: a */
    public abstract void mo1454a(androidx.lifecycle.InterfaceC0470u r1);

    /* renamed from: b */
    public abstract void mo1455b(androidx.lifecycle.InterfaceC0470u r1);
}
