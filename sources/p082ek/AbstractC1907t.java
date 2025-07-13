package p082ek;

/* renamed from: ek.t */
/* loaded from: classes.dex */
public abstract class AbstractC1907t<T> {

    /* renamed from: ek.t$a */
    public static final class a<T> extends p082ek.AbstractC1907t<T> {

        /* renamed from: a */
        public final java.lang.reflect.Method f8211a;

        /* renamed from: b */
        public final int f8212b;

        /* renamed from: c */
        public final p082ek.InterfaceC1892f<T, bi.AbstractC0781f0> f8213c;

        public a(java.lang.reflect.Method r1, int r2, p082ek.InterfaceC1892f<T, bi.AbstractC0781f0> r3) {
                r0 = this;
                r0.<init>()
                r0.f8211a = r1
                r0.f8212b = r2
                r0.f8213c = r3
                return
        }

        @Override // p082ek.AbstractC1907t
        /* renamed from: a */
        public void mo4684a(p082ek.C1909v r6, T r7) {
                r5 = this;
                r0 = 0
                if (r7 == 0) goto L30
                ek.f<T, bi.f0> r1 = r5.f8213c     // Catch: java.io.IOException -> Le
                java.lang.Object r1 = r1.mo4642a(r7)     // Catch: java.io.IOException -> Le
                bi.f0 r1 = (bi.AbstractC0781f0) r1     // Catch: java.io.IOException -> Le
                r6.f8266k = r1
                return
            Le:
                r6 = move-exception
                java.lang.reflect.Method r1 = r5.f8211a
                int r2 = r5.f8212b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Unable to convert "
                r3.append(r4)
                r3.append(r7)
                java.lang.String r7 = " to RequestBody"
                r3.append(r7)
                java.lang.String r7 = r3.toString()
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r6 = p082ek.C1893f0.m4672m(r1, r6, r2, r7, r0)
                throw r6
            L30:
                java.lang.reflect.Method r6 = r5.f8211a
                int r7 = r5.f8212b
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Body parameter value must not be null."
                java.lang.RuntimeException r6 = p082ek.C1893f0.m4671l(r6, r7, r1, r0)
                throw r6
        }
    }

    /* renamed from: ek.t$b */
    public static final class b<T> extends p082ek.AbstractC1907t<T> {

        /* renamed from: a */
        public final java.lang.String f8214a;

        /* renamed from: b */
        public final p082ek.InterfaceC1892f<T, java.lang.String> f8215b;

        /* renamed from: c */
        public final boolean f8216c;

        public b(java.lang.String r2, p082ek.InterfaceC1892f<T, java.lang.String> r3, boolean r4) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "name == null"
                java.util.Objects.requireNonNull(r2, r0)
                r1.f8214a = r2
                r1.f8215b = r3
                r1.f8216c = r4
                return
        }

        @Override // p082ek.AbstractC1907t
        /* renamed from: a */
        public void mo4684a(p082ek.C1909v r3, T r4) {
                r2 = this;
                if (r4 != 0) goto L3
                return
            L3:
                ek.f<T, java.lang.String> r0 = r2.f8215b
                java.lang.Object r4 = r0.mo4642a(r4)
                java.lang.String r4 = (java.lang.String) r4
                if (r4 != 0) goto Le
                return
            Le:
                java.lang.String r0 = r2.f8214a
                boolean r1 = r2.f8216c
                r3.m4687a(r0, r4, r1)
                return
        }
    }

    /* renamed from: ek.t$c */
    public static final class c<T> extends p082ek.AbstractC1907t<java.util.Map<java.lang.String, T>> {

        /* renamed from: a */
        public final java.lang.reflect.Method f8217a;

        /* renamed from: b */
        public final int f8218b;

        /* renamed from: c */
        public final boolean f8219c;

        public c(java.lang.reflect.Method r1, int r2, p082ek.InterfaceC1892f<T, java.lang.String> r3, boolean r4) {
                r0 = this;
                r0.<init>()
                r0.f8217a = r1
                r0.f8218b = r2
                r0.f8219c = r4
                return
        }

        @Override // p082ek.AbstractC1907t
        /* renamed from: a */
        public void mo4684a(p082ek.C1909v r7, java.lang.Object r8) {
                r6 = this;
                java.util.Map r8 = (java.util.Map) r8
                r0 = 0
                if (r8 == 0) goto L89
                java.util.Set r8 = r8.entrySet()
                java.util.Iterator r8 = r8.iterator()
            Ld:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto L88
                java.lang.Object r1 = r8.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L7b
                java.lang.Object r1 = r1.getValue()
                java.lang.String r3 = "'."
                if (r1 == 0) goto L6a
                java.lang.String r4 = r1.toString()
                if (r4 == 0) goto L35
                boolean r1 = r6.f8219c
                r7.m4687a(r2, r4, r1)
                goto Ld
            L35:
                java.lang.reflect.Method r7 = r6.f8217a
                int r8 = r6.f8218b
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Field map value '"
                r4.append(r5)
                r4.append(r1)
                java.lang.String r1 = "' converted to null by "
                r4.append(r1)
                java.lang.Class<ek.a$d> r1 = p082ek.C1882a.d.class
                java.lang.String r1 = r1.getName()
                r4.append(r1)
                java.lang.String r1 = " for key '"
                r4.append(r1)
                r4.append(r2)
                r4.append(r3)
                java.lang.String r1 = r4.toString()
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = p082ek.C1893f0.m4671l(r7, r8, r1, r0)
                throw r7
            L6a:
                java.lang.reflect.Method r7 = r6.f8217a
                int r8 = r6.f8218b
                java.lang.String r1 = "Field map contained null value for key '"
                java.lang.String r1 = android.support.v4.media.C0145d.m257a(r1, r2, r3)
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = p082ek.C1893f0.m4671l(r7, r8, r1, r0)
                throw r7
            L7b:
                java.lang.reflect.Method r7 = r6.f8217a
                int r8 = r6.f8218b
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Field map contained null key."
                java.lang.RuntimeException r7 = p082ek.C1893f0.m4671l(r7, r8, r1, r0)
                throw r7
            L88:
                return
            L89:
                java.lang.reflect.Method r7 = r6.f8217a
                int r8 = r6.f8218b
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Field map was null."
                java.lang.RuntimeException r7 = p082ek.C1893f0.m4671l(r7, r8, r1, r0)
                throw r7
        }
    }

    /* renamed from: ek.t$d */
    public static final class d<T> extends p082ek.AbstractC1907t<T> {

        /* renamed from: a */
        public final java.lang.String f8220a;

        /* renamed from: b */
        public final p082ek.InterfaceC1892f<T, java.lang.String> f8221b;

        public d(java.lang.String r2, p082ek.InterfaceC1892f<T, java.lang.String> r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "name == null"
                java.util.Objects.requireNonNull(r2, r0)
                r1.f8220a = r2
                r1.f8221b = r3
                return
        }

        @Override // p082ek.AbstractC1907t
        /* renamed from: a */
        public void mo4684a(p082ek.C1909v r2, T r3) {
                r1 = this;
                if (r3 != 0) goto L3
                return
            L3:
                ek.f<T, java.lang.String> r0 = r1.f8221b
                java.lang.Object r3 = r0.mo4642a(r3)
                java.lang.String r3 = (java.lang.String) r3
                if (r3 != 0) goto Le
                return
            Le:
                java.lang.String r0 = r1.f8220a
                r2.m4688b(r0, r3)
                return
        }
    }

    /* renamed from: ek.t$e */
    public static final class e<T> extends p082ek.AbstractC1907t<java.util.Map<java.lang.String, T>> {

        /* renamed from: a */
        public final java.lang.reflect.Method f8222a;

        /* renamed from: b */
        public final int f8223b;

        public e(java.lang.reflect.Method r1, int r2, p082ek.InterfaceC1892f<T, java.lang.String> r3) {
                r0 = this;
                r0.<init>()
                r0.f8222a = r1
                r0.f8223b = r2
                return
        }

        @Override // p082ek.AbstractC1907t
        /* renamed from: a */
        public void mo4684a(p082ek.C1909v r5, java.lang.Object r6) {
                r4 = this;
                java.util.Map r6 = (java.util.Map) r6
                r0 = 0
                if (r6 == 0) goto L50
                java.util.Set r6 = r6.entrySet()
                java.util.Iterator r6 = r6.iterator()
            Ld:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L4f
                java.lang.Object r1 = r6.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L42
                java.lang.Object r1 = r1.getValue()
                if (r1 == 0) goto L2f
                java.lang.String r1 = r1.toString()
                r5.m4688b(r2, r1)
                goto Ld
            L2f:
                java.lang.reflect.Method r5 = r4.f8222a
                int r6 = r4.f8223b
                java.lang.String r1 = "Header map contained null value for key '"
                java.lang.String r3 = "'."
                java.lang.String r1 = android.support.v4.media.C0145d.m257a(r1, r2, r3)
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r5 = p082ek.C1893f0.m4671l(r5, r6, r1, r0)
                throw r5
            L42:
                java.lang.reflect.Method r5 = r4.f8222a
                int r6 = r4.f8223b
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Header map contained null key."
                java.lang.RuntimeException r5 = p082ek.C1893f0.m4671l(r5, r6, r1, r0)
                throw r5
            L4f:
                return
            L50:
                java.lang.reflect.Method r5 = r4.f8222a
                int r6 = r4.f8223b
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Header map was null."
                java.lang.RuntimeException r5 = p082ek.C1893f0.m4671l(r5, r6, r1, r0)
                throw r5
        }
    }

    /* renamed from: ek.t$f */
    public static final class f extends p082ek.AbstractC1907t<bi.C0802v> {

        /* renamed from: a */
        public final java.lang.reflect.Method f8224a;

        /* renamed from: b */
        public final int f8225b;

        public f(java.lang.reflect.Method r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.f8224a = r1
                r0.f8225b = r2
                return
        }

        @Override // p082ek.AbstractC1907t
        /* renamed from: a */
        public void mo4684a(p082ek.C1909v r5, bi.C0802v r6) {
                r4 = this;
                bi.v r6 = (bi.C0802v) r6
                r0 = 0
                if (r6 == 0) goto L24
                bi.v$a r5 = r5.f8261f
                java.util.Objects.requireNonNull(r5)
                java.lang.String r1 = "headers"
                p214m2.C4339q.m9706k(r6, r1)
                int r1 = r6.size()
            L13:
                if (r0 >= r1) goto L23
                java.lang.String r2 = r6.m2429e(r0)
                java.lang.String r3 = r6.m2431i(r0)
                r5.m2433b(r2, r3)
                int r0 = r0 + 1
                goto L13
            L23:
                return
            L24:
                java.lang.reflect.Method r5 = r4.f8224a
                int r6 = r4.f8225b
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Headers parameter must not be null."
                java.lang.RuntimeException r5 = p082ek.C1893f0.m4671l(r5, r6, r1, r0)
                throw r5
        }
    }

    /* renamed from: ek.t$g */
    public static final class g<T> extends p082ek.AbstractC1907t<T> {

        /* renamed from: a */
        public final java.lang.reflect.Method f8226a;

        /* renamed from: b */
        public final int f8227b;

        /* renamed from: c */
        public final bi.C0802v f8228c;

        /* renamed from: d */
        public final p082ek.InterfaceC1892f<T, bi.AbstractC0781f0> f8229d;

        public g(java.lang.reflect.Method r1, int r2, bi.C0802v r3, p082ek.InterfaceC1892f<T, bi.AbstractC0781f0> r4) {
                r0 = this;
                r0.<init>()
                r0.f8226a = r1
                r0.f8227b = r2
                r0.f8228c = r3
                r0.f8229d = r4
                return
        }

        @Override // p082ek.AbstractC1907t
        /* renamed from: a */
        public void mo4684a(p082ek.C1909v r5, T r6) {
                r4 = this;
                if (r6 != 0) goto L3
                return
            L3:
                ek.f<T, bi.f0> r0 = r4.f8229d     // Catch: java.io.IOException -> L11
                java.lang.Object r0 = r0.mo4642a(r6)     // Catch: java.io.IOException -> L11
                bi.f0 r0 = (bi.AbstractC0781f0) r0     // Catch: java.io.IOException -> L11
                bi.v r6 = r4.f8228c
                r5.m4689c(r6, r0)
                return
            L11:
                r5 = move-exception
                java.lang.reflect.Method r0 = r4.f8226a
                int r1 = r4.f8227b
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Unable to convert "
                r2.append(r3)
                r2.append(r6)
                java.lang.String r6 = " to RequestBody"
                r2.append(r6)
                java.lang.String r6 = r2.toString()
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r5
                java.lang.RuntimeException r5 = p082ek.C1893f0.m4671l(r0, r1, r6, r2)
                throw r5
        }
    }

    /* renamed from: ek.t$h */
    public static final class h<T> extends p082ek.AbstractC1907t<java.util.Map<java.lang.String, T>> {

        /* renamed from: a */
        public final java.lang.reflect.Method f8230a;

        /* renamed from: b */
        public final int f8231b;

        /* renamed from: c */
        public final p082ek.InterfaceC1892f<T, bi.AbstractC0781f0> f8232c;

        /* renamed from: d */
        public final java.lang.String f8233d;

        public h(java.lang.reflect.Method r1, int r2, p082ek.InterfaceC1892f<T, bi.AbstractC0781f0> r3, java.lang.String r4) {
                r0 = this;
                r0.<init>()
                r0.f8230a = r1
                r0.f8231b = r2
                r0.f8232c = r3
                r0.f8233d = r4
                return
        }

        @Override // p082ek.AbstractC1907t
        /* renamed from: a */
        public void mo4684a(p082ek.C1909v r8, java.lang.Object r9) {
                r7 = this;
                java.util.Map r9 = (java.util.Map) r9
                r0 = 0
                if (r9 == 0) goto L76
                java.util.Set r9 = r9.entrySet()
                java.util.Iterator r9 = r9.iterator()
            Ld:
                boolean r1 = r9.hasNext()
                if (r1 == 0) goto L75
                java.lang.Object r1 = r9.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L68
                java.lang.Object r1 = r1.getValue()
                if (r1 == 0) goto L55
                r3 = 4
                java.lang.String[] r3 = new java.lang.String[r3]
                java.lang.String r4 = "Content-Disposition"
                r3[r0] = r4
                r4 = 1
                java.lang.String r5 = "form-data; name=\""
                java.lang.String r6 = "\""
                java.lang.String r2 = android.support.v4.media.C0145d.m257a(r5, r2, r6)
                r3[r4] = r2
                r2 = 2
                java.lang.String r4 = "Content-Transfer-Encoding"
                r3[r2] = r4
                r2 = 3
                java.lang.String r4 = r7.f8233d
                r3[r2] = r4
                bi.v$b r2 = bi.C0802v.f4340Z
                bi.v r2 = r2.m2438c(r3)
                ek.f<T, bi.f0> r3 = r7.f8232c
                java.lang.Object r1 = r3.mo4642a(r1)
                bi.f0 r1 = (bi.AbstractC0781f0) r1
                r8.m4689c(r2, r1)
                goto Ld
            L55:
                java.lang.reflect.Method r8 = r7.f8230a
                int r9 = r7.f8231b
                java.lang.String r1 = "Part map contained null value for key '"
                java.lang.String r3 = "'."
                java.lang.String r1 = android.support.v4.media.C0145d.m257a(r1, r2, r3)
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r8 = p082ek.C1893f0.m4671l(r8, r9, r1, r0)
                throw r8
            L68:
                java.lang.reflect.Method r8 = r7.f8230a
                int r9 = r7.f8231b
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Part map contained null key."
                java.lang.RuntimeException r8 = p082ek.C1893f0.m4671l(r8, r9, r1, r0)
                throw r8
            L75:
                return
            L76:
                java.lang.reflect.Method r8 = r7.f8230a
                int r9 = r7.f8231b
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Part map was null."
                java.lang.RuntimeException r8 = p082ek.C1893f0.m4671l(r8, r9, r1, r0)
                throw r8
        }
    }

    /* renamed from: ek.t$i */
    public static final class i<T> extends p082ek.AbstractC1907t<T> {

        /* renamed from: a */
        public final java.lang.reflect.Method f8234a;

        /* renamed from: b */
        public final int f8235b;

        /* renamed from: c */
        public final java.lang.String f8236c;

        /* renamed from: d */
        public final p082ek.InterfaceC1892f<T, java.lang.String> f8237d;

        /* renamed from: e */
        public final boolean f8238e;

        public i(java.lang.reflect.Method r1, int r2, java.lang.String r3, p082ek.InterfaceC1892f<T, java.lang.String> r4, boolean r5) {
                r0 = this;
                r0.<init>()
                r0.f8234a = r1
                r0.f8235b = r2
                java.lang.String r1 = "name == null"
                java.util.Objects.requireNonNull(r3, r1)
                r0.f8236c = r3
                r0.f8237d = r4
                r0.f8238e = r5
                return
        }

        @Override // p082ek.AbstractC1907t
        /* renamed from: a */
        public void mo4684a(p082ek.C1909v r18, T r19) {
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                r3 = 0
                if (r2 == 0) goto Lfa
                java.lang.String r4 = r0.f8236c
                ek.f<T, java.lang.String> r5 = r0.f8237d
                java.lang.Object r2 = r5.mo4642a(r2)
                java.lang.String r2 = (java.lang.String) r2
                boolean r5 = r0.f8238e
                java.lang.String r6 = r1.f8258c
                if (r6 == 0) goto Lf4
                int r6 = r2.length()
                r7 = 0
            L1e:
                if (r7 >= r6) goto Lbc
                int r8 = r2.codePointAt(r7)
                r9 = 47
                r10 = -1
                java.lang.String r11 = " \"<>^`{}|\\?#"
                r12 = 127(0x7f, float:1.78E-43)
                r13 = 37
                r14 = 32
                if (r8 < r14) goto L46
                if (r8 >= r12) goto L46
                int r15 = r11.indexOf(r8)
                if (r15 != r10) goto L46
                if (r5 != 0) goto L40
                if (r8 == r9) goto L46
                if (r8 != r13) goto L40
                goto L46
            L40:
                int r8 = java.lang.Character.charCount(r8)
                int r7 = r7 + r8
                goto L1e
            L46:
                oi.e r8 = new oi.e
                r8.<init>()
                r8.m11548J0(r2, r3, r7)
                r3 = 0
            L4f:
                if (r7 >= r6) goto Lb7
                int r13 = r2.codePointAt(r7)
                if (r5 == 0) goto L68
                r15 = 9
                if (r13 == r15) goto Lae
                r15 = 10
                if (r13 == r15) goto Lae
                r15 = 12
                if (r13 == r15) goto Lae
                r15 = 13
                if (r13 != r15) goto L68
                goto Lae
            L68:
                if (r13 < r14) goto L7f
                if (r13 >= r12) goto L7f
                int r15 = r11.indexOf(r13)
                if (r15 != r10) goto L7f
                if (r5 != 0) goto L7b
                if (r13 == r9) goto L7f
                r9 = 37
                if (r13 != r9) goto L7b
                goto L7f
            L7b:
                r8.m11550K0(r13)
                goto Lae
            L7f:
                if (r3 != 0) goto L86
                oi.e r3 = new oi.e
                r3.<init>()
            L86:
                r3.m11550K0(r13)
            L89:
                boolean r9 = r3.mo11541F()
                if (r9 != 0) goto Lae
                byte r9 = r3.readByte()
                r9 = r9 & 255(0xff, float:3.57E-43)
                r15 = 37
                r8.m11539D0(r15)
                char[] r15 = p082ek.C1909v.f8254l
                int r16 = r9 >> 4
                r16 = r16 & 15
                char r10 = r15[r16]
                r8.m11539D0(r10)
                r9 = r9 & 15
                char r9 = r15[r9]
                r8.m11539D0(r9)
                r10 = -1
                goto L89
            Lae:
                int r9 = java.lang.Character.charCount(r13)
                int r7 = r7 + r9
                r9 = 47
                r10 = -1
                goto L4f
            Lb7:
                java.lang.String r3 = r8.m11565i0()
                goto Lbd
            Lbc:
                r3 = r2
            Lbd:
                java.lang.String r5 = r1.f8258c
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "{"
                r6.append(r7)
                r6.append(r4)
                java.lang.String r4 = "}"
                r6.append(r4)
                java.lang.String r4 = r6.toString()
                java.lang.String r3 = r5.replace(r4, r3)
                java.util.regex.Pattern r4 = p082ek.C1909v.f8255m
                java.util.regex.Matcher r4 = r4.matcher(r3)
                boolean r4 = r4.matches()
                if (r4 != 0) goto Le8
                r1.f8258c = r3
                return
            Le8:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "@Path parameters shouldn't perform path traversal ('.' or '..'): "
                java.lang.String r2 = p064e.C1493g.m4049a(r3, r2)
                r1.<init>(r2)
                throw r1
            Lf4:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
            Lfa:
                java.lang.reflect.Method r1 = r0.f8234a
                int r2 = r0.f8235b
                java.lang.String r4 = "Path parameter \""
                java.lang.StringBuilder r4 = android.support.v4.media.C0144c.m256a(r4)
                java.lang.String r5 = r0.f8236c
                java.lang.String r6 = "\" value must not be null."
                java.lang.String r4 = p346u.C6269n.m12888a(r4, r5, r6)
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.RuntimeException r1 = p082ek.C1893f0.m4671l(r1, r2, r4, r3)
                throw r1
        }
    }

    /* renamed from: ek.t$j */
    public static final class j<T> extends p082ek.AbstractC1907t<T> {

        /* renamed from: a */
        public final java.lang.String f8239a;

        /* renamed from: b */
        public final p082ek.InterfaceC1892f<T, java.lang.String> f8240b;

        /* renamed from: c */
        public final boolean f8241c;

        public j(java.lang.String r2, p082ek.InterfaceC1892f<T, java.lang.String> r3, boolean r4) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "name == null"
                java.util.Objects.requireNonNull(r2, r0)
                r1.f8239a = r2
                r1.f8240b = r3
                r1.f8241c = r4
                return
        }

        @Override // p082ek.AbstractC1907t
        /* renamed from: a */
        public void mo4684a(p082ek.C1909v r3, T r4) {
                r2 = this;
                if (r4 != 0) goto L3
                return
            L3:
                ek.f<T, java.lang.String> r0 = r2.f8240b
                java.lang.Object r4 = r0.mo4642a(r4)
                java.lang.String r4 = (java.lang.String) r4
                if (r4 != 0) goto Le
                return
            Le:
                java.lang.String r0 = r2.f8239a
                boolean r1 = r2.f8241c
                r3.m4690d(r0, r4, r1)
                return
        }
    }

    /* renamed from: ek.t$k */
    public static final class k<T> extends p082ek.AbstractC1907t<java.util.Map<java.lang.String, T>> {

        /* renamed from: a */
        public final java.lang.reflect.Method f8242a;

        /* renamed from: b */
        public final int f8243b;

        /* renamed from: c */
        public final boolean f8244c;

        public k(java.lang.reflect.Method r1, int r2, p082ek.InterfaceC1892f<T, java.lang.String> r3, boolean r4) {
                r0 = this;
                r0.<init>()
                r0.f8242a = r1
                r0.f8243b = r2
                r0.f8244c = r4
                return
        }

        @Override // p082ek.AbstractC1907t
        /* renamed from: a */
        public void mo4684a(p082ek.C1909v r7, java.lang.Object r8) {
                r6 = this;
                java.util.Map r8 = (java.util.Map) r8
                r0 = 0
                if (r8 == 0) goto L89
                java.util.Set r8 = r8.entrySet()
                java.util.Iterator r8 = r8.iterator()
            Ld:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto L88
                java.lang.Object r1 = r8.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L7b
                java.lang.Object r1 = r1.getValue()
                java.lang.String r3 = "'."
                if (r1 == 0) goto L6a
                java.lang.String r4 = r1.toString()
                if (r4 == 0) goto L35
                boolean r1 = r6.f8244c
                r7.m4690d(r2, r4, r1)
                goto Ld
            L35:
                java.lang.reflect.Method r7 = r6.f8242a
                int r8 = r6.f8243b
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Query map value '"
                r4.append(r5)
                r4.append(r1)
                java.lang.String r1 = "' converted to null by "
                r4.append(r1)
                java.lang.Class<ek.a$d> r1 = p082ek.C1882a.d.class
                java.lang.String r1 = r1.getName()
                r4.append(r1)
                java.lang.String r1 = " for key '"
                r4.append(r1)
                r4.append(r2)
                r4.append(r3)
                java.lang.String r1 = r4.toString()
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = p082ek.C1893f0.m4671l(r7, r8, r1, r0)
                throw r7
            L6a:
                java.lang.reflect.Method r7 = r6.f8242a
                int r8 = r6.f8243b
                java.lang.String r1 = "Query map contained null value for key '"
                java.lang.String r1 = android.support.v4.media.C0145d.m257a(r1, r2, r3)
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = p082ek.C1893f0.m4671l(r7, r8, r1, r0)
                throw r7
            L7b:
                java.lang.reflect.Method r7 = r6.f8242a
                int r8 = r6.f8243b
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Query map contained null key."
                java.lang.RuntimeException r7 = p082ek.C1893f0.m4671l(r7, r8, r1, r0)
                throw r7
            L88:
                return
            L89:
                java.lang.reflect.Method r7 = r6.f8242a
                int r8 = r6.f8243b
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Query map was null"
                java.lang.RuntimeException r7 = p082ek.C1893f0.m4671l(r7, r8, r1, r0)
                throw r7
        }
    }

    /* renamed from: ek.t$l */
    public static final class l<T> extends p082ek.AbstractC1907t<T> {

        /* renamed from: a */
        public final boolean f8245a;

        public l(p082ek.InterfaceC1892f<T, java.lang.String> r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.f8245a = r2
                return
        }

        @Override // p082ek.AbstractC1907t
        /* renamed from: a */
        public void mo4684a(p082ek.C1909v r3, T r4) {
                r2 = this;
                if (r4 != 0) goto L3
                return
            L3:
                java.lang.String r4 = r4.toString()
                r0 = 0
                boolean r1 = r2.f8245a
                r3.m4690d(r4, r0, r1)
                return
        }
    }

    /* renamed from: ek.t$m */
    public static final class m extends p082ek.AbstractC1907t<bi.C0806z.b> {

        /* renamed from: a */
        public static final p082ek.AbstractC1907t.m f8246a = null;

        static {
                ek.t$m r0 = new ek.t$m
                r0.<init>()
                p082ek.AbstractC1907t.m.f8246a = r0
                return
        }

        public m() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p082ek.AbstractC1907t
        /* renamed from: a */
        public void mo4684a(p082ek.C1909v r2, bi.C0806z.b r3) {
                r1 = this;
                bi.z$b r3 = (bi.C0806z.b) r3
                if (r3 == 0) goto L13
                bi.z$a r2 = r2.f8264i
                java.util.Objects.requireNonNull(r2)
                java.lang.String r0 = "part"
                p214m2.C4339q.m9706k(r3, r0)
                java.util.List<bi.z$b> r2 = r2.f4380c
                r2.add(r3)
            L13:
                return
        }
    }

    /* renamed from: ek.t$n */
    public static final class n extends p082ek.AbstractC1907t<java.lang.Object> {

        /* renamed from: a */
        public final java.lang.reflect.Method f8247a;

        /* renamed from: b */
        public final int f8248b;

        public n(java.lang.reflect.Method r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.f8247a = r1
                r0.f8248b = r2
                return
        }

        @Override // p082ek.AbstractC1907t
        /* renamed from: a */
        public void mo4684a(p082ek.C1909v r3, java.lang.Object r4) {
                r2 = this;
                if (r4 == 0) goto Lc
                java.util.Objects.requireNonNull(r3)
                java.lang.String r4 = r4.toString()
                r3.f8258c = r4
                return
            Lc:
                java.lang.reflect.Method r3 = r2.f8247a
                int r4 = r2.f8248b
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "@Url parameter is null."
                java.lang.RuntimeException r3 = p082ek.C1893f0.m4671l(r3, r4, r1, r0)
                throw r3
        }
    }

    /* renamed from: ek.t$o */
    public static final class o<T> extends p082ek.AbstractC1907t<T> {

        /* renamed from: a */
        public final java.lang.Class<T> f8249a;

        public o(java.lang.Class<T> r1) {
                r0 = this;
                r0.<init>()
                r0.f8249a = r1
                return
        }

        @Override // p082ek.AbstractC1907t
        /* renamed from: a */
        public void mo4684a(p082ek.C1909v r2, T r3) {
                r1 = this;
                java.lang.Class<T> r0 = r1.f8249a
                bi.c0$a r2 = r2.f8260e
                r2.m2368d(r0, r3)
                return
        }
    }

    public AbstractC1907t() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public abstract void mo4684a(p082ek.C1909v r1, T r2);
}
