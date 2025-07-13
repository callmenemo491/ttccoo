package p227n0;

/* renamed from: n0.c */
/* loaded from: classes.dex */
public final class C4644c {

    /* renamed from: a */
    public final p227n0.C4644c.e f18538a;

    /* renamed from: n0.c$a */
    public static final class a implements p227n0.C4644c.b {

        /* renamed from: a */
        public final android.view.ContentInfo.Builder f18539a;

        public a(android.content.ClipData r2, int r3) {
                r1 = this;
                r1.<init>()
                android.view.ContentInfo$Builder r0 = new android.view.ContentInfo$Builder
                r0.<init>(r2, r3)
                r1.f18539a = r0
                return
        }

        @Override // p227n0.C4644c.b
        /* renamed from: a */
        public void mo10493a(int r2) {
                r1 = this;
                android.view.ContentInfo$Builder r0 = r1.f18539a
                r0.setFlags(r2)
                return
        }

        @Override // p227n0.C4644c.b
        /* renamed from: b */
        public p227n0.C4644c mo10494b() {
                r3 = this;
                n0.c r0 = new n0.c
                n0.c$d r1 = new n0.c$d
                android.view.ContentInfo$Builder r2 = r3.f18539a
                android.view.ContentInfo r2 = r2.build()
                r1.<init>(r2)
                r0.<init>(r1)
                return r0
        }

        @Override // p227n0.C4644c.b
        /* renamed from: c */
        public void mo10495c(android.os.Bundle r2) {
                r1 = this;
                android.view.ContentInfo$Builder r0 = r1.f18539a
                r0.setExtras(r2)
                return
        }

        @Override // p227n0.C4644c.b
        /* renamed from: d */
        public void mo10496d(android.net.Uri r2) {
                r1 = this;
                android.view.ContentInfo$Builder r0 = r1.f18539a
                r0.setLinkUri(r2)
                return
        }
    }

    /* renamed from: n0.c$b */
    public interface b {
        /* renamed from: a */
        void mo10493a(int r1);

        /* renamed from: b */
        p227n0.C4644c mo10494b();

        /* renamed from: c */
        void mo10495c(android.os.Bundle r1);

        /* renamed from: d */
        void mo10496d(android.net.Uri r1);
    }

    /* renamed from: n0.c$c */
    public static final class c implements p227n0.C4644c.b {

        /* renamed from: a */
        public android.content.ClipData f18540a;

        /* renamed from: b */
        public int f18541b;

        /* renamed from: c */
        public int f18542c;

        /* renamed from: d */
        public android.net.Uri f18543d;

        /* renamed from: e */
        public android.os.Bundle f18544e;

        public c(android.content.ClipData r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.f18540a = r1
                r0.f18541b = r2
                return
        }

        @Override // p227n0.C4644c.b
        /* renamed from: a */
        public void mo10493a(int r1) {
                r0 = this;
                r0.f18542c = r1
                return
        }

        @Override // p227n0.C4644c.b
        /* renamed from: b */
        public p227n0.C4644c mo10494b() {
                r2 = this;
                n0.c r0 = new n0.c
                n0.c$f r1 = new n0.c$f
                r1.<init>(r2)
                r0.<init>(r1)
                return r0
        }

        @Override // p227n0.C4644c.b
        /* renamed from: c */
        public void mo10495c(android.os.Bundle r1) {
                r0 = this;
                r0.f18544e = r1
                return
        }

        @Override // p227n0.C4644c.b
        /* renamed from: d */
        public void mo10496d(android.net.Uri r1) {
                r0 = this;
                r0.f18543d = r1
                return
        }
    }

    /* renamed from: n0.c$d */
    public static final class d implements p227n0.C4644c.e {

        /* renamed from: a */
        public final android.view.ContentInfo f18545a;

        public d(android.view.ContentInfo r1) {
                r0 = this;
                r0.<init>()
                java.util.Objects.requireNonNull(r1)
                r0.f18545a = r1
                return
        }

        @Override // p227n0.C4644c.e
        /* renamed from: a */
        public android.content.ClipData mo10497a() {
                r1 = this;
                android.view.ContentInfo r0 = r1.f18545a
                android.content.ClipData r0 = r0.getClip()
                return r0
        }

        @Override // p227n0.C4644c.e
        /* renamed from: b */
        public android.view.ContentInfo mo10498b() {
                r1 = this;
                android.view.ContentInfo r0 = r1.f18545a
                return r0
        }

        @Override // p227n0.C4644c.e
        /* renamed from: c */
        public int mo10499c() {
                r1 = this;
                android.view.ContentInfo r0 = r1.f18545a
                int r0 = r0.getSource()
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "ContentInfoCompat{"
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                android.view.ContentInfo r1 = r2.f18545a
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // p227n0.C4644c.e
        /* renamed from: z */
        public int mo10500z() {
                r1 = this;
                android.view.ContentInfo r0 = r1.f18545a
                int r0 = r0.getFlags()
                return r0
        }
    }

    /* renamed from: n0.c$e */
    public interface e {
        /* renamed from: a */
        android.content.ClipData mo10497a();

        /* renamed from: b */
        android.view.ContentInfo mo10498b();

        /* renamed from: c */
        int mo10499c();

        /* renamed from: z */
        int mo10500z();
    }

    /* renamed from: n0.c$f */
    public static final class f implements p227n0.C4644c.e {

        /* renamed from: a */
        public final android.content.ClipData f18546a;

        /* renamed from: b */
        public final int f18547b;

        /* renamed from: c */
        public final int f18548c;

        /* renamed from: d */
        public final android.net.Uri f18549d;

        /* renamed from: e */
        public final android.os.Bundle f18550e;

        public f(p227n0.C4644c.c r10) {
                r9 = this;
                r9.<init>()
                android.content.ClipData r0 = r10.f18540a
                java.util.Objects.requireNonNull(r0)
                r9.f18546a = r0
                int r0 = r10.f18541b
                r1 = 1
                r2 = 5
                java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                java.lang.String r4 = "source"
                r5 = 2
                r6 = 3
                r7 = 0
                java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                if (r0 < 0) goto L70
                if (r0 > r2) goto L5a
                r9.f18547b = r0
                int r0 = r10.f18542c
                r2 = r0 & 1
                if (r2 != r0) goto L32
                r9.f18548c = r0
                android.net.Uri r0 = r10.f18543d
                r9.f18549d = r0
                android.os.Bundle r10 = r10.f18544e
                r9.f18550e = r10
                return
            L32:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Requested flags 0x"
                java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
                java.lang.String r0 = java.lang.Integer.toHexString(r0)
                r2.append(r0)
                java.lang.String r0 = ", but only 0x"
                r2.append(r0)
                java.lang.String r0 = java.lang.Integer.toHexString(r1)
                r2.append(r0)
                java.lang.String r0 = " are allowed"
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r10.<init>(r0)
                throw r10
            L5a:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                java.util.Locale r0 = java.util.Locale.US
                java.lang.Object[] r2 = new java.lang.Object[r6]
                r2[r7] = r4
                r2[r1] = r8
                r2[r5] = r3
                java.lang.String r1 = "%s is out of range of [%d, %d] (too high)"
                java.lang.String r0 = java.lang.String.format(r0, r1, r2)
                r10.<init>(r0)
                throw r10
            L70:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                java.util.Locale r0 = java.util.Locale.US
                java.lang.Object[] r2 = new java.lang.Object[r6]
                r2[r7] = r4
                r2[r1] = r8
                r2[r5] = r3
                java.lang.String r1 = "%s is out of range of [%d, %d] (too low)"
                java.lang.String r0 = java.lang.String.format(r0, r1, r2)
                r10.<init>(r0)
                throw r10
        }

        @Override // p227n0.C4644c.e
        /* renamed from: a */
        public android.content.ClipData mo10497a() {
                r1 = this;
                android.content.ClipData r0 = r1.f18546a
                return r0
        }

        @Override // p227n0.C4644c.e
        /* renamed from: b */
        public android.view.ContentInfo mo10498b() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // p227n0.C4644c.e
        /* renamed from: c */
        public int mo10499c() {
                r1 = this;
                int r0 = r1.f18547b
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.String r0 = "ContentInfoCompat{clip="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                android.content.ClipData r1 = r4.f18546a
                android.content.ClipDescription r1 = r1.getDescription()
                r0.append(r1)
                java.lang.String r1 = ", source="
                r0.append(r1)
                int r1 = r4.f18547b
                if (r1 == 0) goto L3b
                r2 = 1
                if (r1 == r2) goto L38
                r2 = 2
                if (r1 == r2) goto L35
                r2 = 3
                if (r1 == r2) goto L32
                r2 = 4
                if (r1 == r2) goto L2f
                r2 = 5
                if (r1 == r2) goto L2c
                java.lang.String r1 = java.lang.String.valueOf(r1)
                goto L3d
            L2c:
                java.lang.String r1 = "SOURCE_PROCESS_TEXT"
                goto L3d
            L2f:
                java.lang.String r1 = "SOURCE_AUTOFILL"
                goto L3d
            L32:
                java.lang.String r1 = "SOURCE_DRAG_AND_DROP"
                goto L3d
            L35:
                java.lang.String r1 = "SOURCE_INPUT_METHOD"
                goto L3d
            L38:
                java.lang.String r1 = "SOURCE_CLIPBOARD"
                goto L3d
            L3b:
                java.lang.String r1 = "SOURCE_APP"
            L3d:
                r0.append(r1)
                java.lang.String r1 = ", flags="
                r0.append(r1)
                int r1 = r4.f18548c
                r2 = r1 & 1
                if (r2 == 0) goto L4e
                java.lang.String r1 = "FLAG_CONVERT_TO_PLAIN_TEXT"
                goto L52
            L4e:
                java.lang.String r1 = java.lang.String.valueOf(r1)
            L52:
                r0.append(r1)
                android.net.Uri r1 = r4.f18549d
                java.lang.String r2 = ""
                if (r1 != 0) goto L5d
                r1 = r2
                goto L79
            L5d:
                java.lang.String r1 = ", hasLinkUri("
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                android.net.Uri r3 = r4.f18549d
                java.lang.String r3 = r3.toString()
                int r3 = r3.length()
                r1.append(r3)
                java.lang.String r3 = ")"
                r1.append(r3)
                java.lang.String r1 = r1.toString()
            L79:
                r0.append(r1)
                android.os.Bundle r1 = r4.f18550e
                if (r1 != 0) goto L81
                goto L83
            L81:
                java.lang.String r2 = ", hasExtras"
            L83:
                java.lang.String r1 = "}"
                java.lang.String r0 = p346u.C6269n.m12888a(r0, r2, r1)
                return r0
        }

        @Override // p227n0.C4644c.e
        /* renamed from: z */
        public int mo10500z() {
                r1 = this;
                int r0 = r1.f18548c
                return r0
        }
    }

    public C4644c(p227n0.C4644c.e r1) {
            r0 = this;
            r0.<init>()
            r0.f18538a = r1
            return
    }

    public java.lang.String toString() {
            r1 = this;
            n0.c$e r0 = r1.f18538a
            java.lang.String r0 = r0.toString()
            return r0
    }
}
