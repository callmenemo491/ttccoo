package p317ri;

/* renamed from: ri.d0 */
/* loaded from: classes.dex */
public class C5868d0 extends p317ri.AbstractC5900o {

    /* renamed from: Z */
    public final int f22681Z;

    /* renamed from: a0 */
    public final p317ri.AbstractC5900o[] f22682a0;

    /* renamed from: ri.d0$a */
    public class a implements java.util.Enumeration {

        /* renamed from: a */
        public int f22683a;

        /* renamed from: b */
        public final /* synthetic */ p317ri.C5868d0 f22684b;

        public a(p317ri.C5868d0 r1) {
                r0 = this;
                r0.f22684b = r1
                r0.<init>()
                r1 = 0
                r0.f22683a = r1
                return
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
                r2 = this;
                int r0 = r2.f22683a
                ri.d0 r1 = r2.f22684b
                ri.o[] r1 = r1.f22682a0
                int r1 = r1.length
                if (r0 >= r1) goto Lb
                r0 = 1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                return r0
        }

        @Override // java.util.Enumeration
        public java.lang.Object nextElement() {
                r3 = this;
                ri.d0 r0 = r3.f22684b
                ri.o[] r0 = r0.f22682a0
                int r1 = r3.f22683a
                int r2 = r1 + 1
                r3.f22683a = r2
                r0 = r0[r1]
                return r0
        }
    }

    public C5868d0(byte[] r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.f22682a0 = r1
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.f22681Z = r1
            return
    }

    public C5868d0(p317ri.AbstractC5900o[] r4) {
            r3 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.length
            if (r1 == r2) goto L4e
            r2 = r4[r1]     // Catch: java.io.IOException -> L15 java.lang.ClassCastException -> L2d
            ri.x0 r2 = (p317ri.C5927x0) r2     // Catch: java.io.IOException -> L15 java.lang.ClassCastException -> L2d
            byte[] r2 = r2.f22723Y     // Catch: java.io.IOException -> L15 java.lang.ClassCastException -> L2d
            r0.write(r2)     // Catch: java.io.IOException -> L15 java.lang.ClassCastException -> L2d
            int r1 = r1 + 1
            goto L6
        L15:
            r4 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "exception converting octets "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r4 = r4.toString()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L2d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r4 = r4[r1]
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r2.append(r4)
            java.lang.String r4 = " found in input should only contain DEROctetString"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r0.<init>(r4)
            throw r0
        L4e:
            byte[] r0 = r0.toByteArray()
            r3.<init>(r0)
            r3.f22682a0 = r4
            r4 = 1000(0x3e8, float:1.401E-42)
            r3.f22681Z = r4
            return
    }

    @Override // p317ri.AbstractC5900o
    /* renamed from: E */
    public byte[] mo12219E() {
            r1 = this;
            byte[] r0 = r1.f22723Y
            return r0
    }

    /* renamed from: F */
    public java.util.Enumeration m12220F() {
            r6 = this;
            ri.o[] r0 = r6.f22682a0
            if (r0 != 0) goto L2e
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r1 = 0
            r2 = 0
        Lb:
            byte[] r3 = r6.f22723Y
            int r4 = r3.length
            if (r2 >= r4) goto L29
            int r4 = r6.f22681Z
            int r4 = r4 + r2
            int r5 = r3.length
            if (r4 <= r5) goto L17
            int r4 = r3.length
        L17:
            int r4 = r4 - r2
            byte[] r5 = new byte[r4]
            java.lang.System.arraycopy(r3, r2, r5, r1, r4)
            ri.x0 r3 = new ri.x0
            r3.<init>(r5)
            r0.addElement(r3)
            int r3 = r6.f22681Z
            int r2 = r2 + r3
            goto Lb
        L29:
            java.util.Enumeration r0 = r0.elements()
            return r0
        L2e:
            ri.d0$a r0 = new ri.d0$a
            r0.<init>(r6)
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: p */
    public void mo12204p(p317ri.C5906q r3) {
            r2 = this;
            r0 = 36
            r3.mo12264c(r0)
            r0 = 128(0x80, float:1.8E-43)
            r3.mo12264c(r0)
            java.util.Enumeration r0 = r2.m12220F()
        Le:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.nextElement()
            ri.e r1 = (p317ri.InterfaceC5870e) r1
            r3.mo12244h(r1)
            goto Le
        L1e:
            r0 = 0
            r3.mo12264c(r0)
            r3.mo12264c(r0)
            return
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: q */
    public int mo12205q() {
            r3 = this;
            java.util.Enumeration r0 = r3.m12220F()
            r1 = 0
        L5:
            boolean r2 = r0.hasMoreElements()
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r0.nextElement()
            ri.e r2 = (p317ri.InterfaceC5870e) r2
            ri.s r2 = r2.mo168e()
            int r2 = r2.mo12205q()
            int r1 = r1 + r2
            goto L5
        L1b:
            int r1 = r1 + 2
            int r1 = r1 + 2
            return r1
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: w */
    public boolean mo12206w() {
            r1 = this;
            r0 = 1
            return r0
    }
}
