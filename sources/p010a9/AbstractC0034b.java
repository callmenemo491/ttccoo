package p010a9;

/* renamed from: a9.b */
/* loaded from: classes.dex */
public abstract class AbstractC0034b implements p010a9.InterfaceC0039g<java.lang.Character> {

    /* renamed from: a9.b$a */
    public static abstract class a extends p010a9.AbstractC0034b {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p010a9.InterfaceC0039g
        @java.lang.Deprecated
        public boolean apply(java.lang.Character r1) {
                r0 = this;
                java.lang.Character r1 = (java.lang.Character) r1
                char r1 = r1.charValue()
                boolean r1 = r0.mo39c(r1)
                return r1
        }
    }

    /* renamed from: a9.b$b */
    public static final class b extends p010a9.AbstractC0034b.a {

        /* renamed from: Y */
        public final char f77Y;

        public b(char r1) {
                r0 = this;
                r0.<init>()
                r0.f77Y = r1
                return
        }

        @Override // p010a9.AbstractC0034b
        /* renamed from: c */
        public boolean mo39c(char r2) {
                r1 = this;
                char r0 = r1.f77Y
                if (r2 != r0) goto L6
                r2 = 1
                goto L7
            L6:
                r2 = 0
            L7:
                return r2
        }

        public java.lang.String toString() {
                r8 = this;
                java.lang.String r0 = "CharMatcher.is('"
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                char r1 = r8.f77Y
                r2 = 6
                char[] r2 = new char[r2]
                r2 = {x0034: FILL_ARRAY_DATA , data: [92, 117, 0, 0, 0, 0} // fill-array
                r3 = 0
            Lf:
                r4 = 4
                if (r3 >= r4) goto L23
                int r5 = 5 - r3
                r6 = r1 & 15
                java.lang.String r7 = "0123456789ABCDEF"
                char r6 = r7.charAt(r6)
                r2[r5] = r6
                int r1 = r1 >> r4
                char r1 = (char) r1
                int r3 = r3 + 1
                goto Lf
            L23:
                java.lang.String r1 = java.lang.String.copyValueOf(r2)
                r0.append(r1)
                java.lang.String r1 = "')"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: a9.b$c */
    public static abstract class c extends p010a9.AbstractC0034b.a {

        /* renamed from: Y */
        public final java.lang.String f78Y;

        public c(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.f78Y = r1
                return
        }

        public final java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.f78Y
                return r0
        }
    }

    /* renamed from: a9.b$d */
    public static final class d extends p010a9.AbstractC0034b.c {

        /* renamed from: Z */
        public static final p010a9.AbstractC0034b.d f79Z = null;

        static {
                a9.b$d r0 = new a9.b$d
                r0.<init>()
                p010a9.AbstractC0034b.d.f79Z = r0
                return
        }

        public d() {
                r1 = this;
                java.lang.String r0 = "CharMatcher.none()"
                r1.<init>(r0)
                return
        }

        @Override // p010a9.AbstractC0034b
        /* renamed from: a */
        public int mo37a(java.lang.CharSequence r1) {
                r0 = this;
                java.util.Objects.requireNonNull(r1)
                r1 = -1
                return r1
        }

        @Override // p010a9.AbstractC0034b
        /* renamed from: b */
        public int mo38b(java.lang.CharSequence r1, int r2) {
                r0 = this;
                int r1 = r1.length()
                p124h7.C2939x3.m7282h(r2, r1)
                r1 = -1
                return r1
        }

        @Override // p010a9.AbstractC0034b
        /* renamed from: c */
        public boolean mo39c(char r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    public AbstractC0034b() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public int mo37a(java.lang.CharSequence r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.mo38b(r2, r0)
            return r2
    }

    /* renamed from: b */
    public int mo38b(java.lang.CharSequence r3, int r4) {
            r2 = this;
            int r0 = r3.length()
            p124h7.C2939x3.m7282h(r4, r0)
        L7:
            if (r4 >= r0) goto L17
            char r1 = r3.charAt(r4)
            boolean r1 = r2.mo39c(r1)
            if (r1 == 0) goto L14
            return r4
        L14:
            int r4 = r4 + 1
            goto L7
        L17:
            r3 = -1
            return r3
    }

    /* renamed from: c */
    public abstract boolean mo39c(char r1);
}
