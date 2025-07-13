package p124h7;

/* renamed from: h7.hd */
/* loaded from: classes.dex */
public class C2661hd<ResultT, CallbackT> implements p124h7.InterfaceC2697jd {

    /* renamed from: Y */
    public final /* synthetic */ int f11588Y;

    /* renamed from: Z */
    public final p124h7.AbstractC2679id<ResultT, CallbackT> f11589Z;

    /* renamed from: a0 */
    public final p327s7.C5986j<ResultT> f11590a0;

    public C2661hd(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            r0 = 4
            r1.f11588Y = r0
            r1.<init>()
            java.lang.String r0 = "GenericIdpKeyset"
            r1.f11590a0 = r0
            android.content.Context r2 = r2.getApplicationContext()
            if (r3 != 0) goto L15
            android.content.SharedPreferences r2 = android.preference.PreferenceManager.getDefaultSharedPreferences(r2)
            goto L1a
        L15:
            r0 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r0)
        L1a:
            r1.f11589Z = r2
            return
    }

    public C2661hd(androidx.fragment.app.C0392l0 r2, p124h7.InterfaceC2697jd r3) {
            r1 = this;
            r0 = 5
            r1.f11588Y = r0
            r1.f11590a0 = r2
            r1.f11589Z = r3
            r1.<init>()
            return
    }

    public C2661hd(androidx.fragment.app.C0392l0 r1, p124h7.InterfaceC2697jd r2, p139i1.C3058a r3) {
            r0 = this;
            r3 = 6
            r0.f11588Y = r3
            r0.f11590a0 = r1
            r0.f11589Z = r2
            r0.<init>()
            return
    }

    public C2661hd(p124h7.C2532ab r2, p124h7.InterfaceC2697jd r3) {
            r1 = this;
            r0 = 7
            r1.f11588Y = r0
            r1.f11590a0 = r2
            r1.f11589Z = r3
            r1.<init>()
            return
    }

    public C2661hd(p124h7.AbstractC2679id r2, p327s7.C5986j r3) {
            r1 = this;
            r0 = 0
            r1.f11588Y = r0
            r1.<init>()
            r1.f11589Z = r2
            r1.f11590a0 = r3
            return
    }

    public C2661hd(p124h7.InterfaceC2685j1 r2) {
            r1 = this;
            r0 = 1
            r1.f11588Y = r0
            h7.xa r0 = p124h7.C2946xa.f12020Z
            r1.<init>()
            r1.f11590a0 = r2
            r1.f11589Z = r0
            return
    }

    public C2661hd(p124h7.InterfaceC2703k1 r2) {
            r1 = this;
            r0 = 3
            r1.f11588Y = r0
            r1.<init>()
            r1.f11589Z = r2
            r2 = 0
            r1.f11590a0 = r2
            return
    }

    public C2661hd(p124h7.InterfaceC2739m1 r2) {
            r1 = this;
            r0 = 3
            r1.f11588Y = r0
            r1.<init>()
            r0 = 0
            r1.f11589Z = r0
            r1.f11590a0 = r2
            return
    }

    public C2661hd(p124h7.AbstractC2847s1 r4, java.lang.Class r5) {
            r3 = this;
            r0 = 2
            r3.f11588Y = r0
            r3.<init>()
            java.util.Set r1 = r4.m7121f()
            boolean r1 = r1.contains(r5)
            if (r1 != 0) goto L35
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L19
            goto L35
        L19:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            java.lang.String r4 = r4.toString()
            r0[r2] = r4
            r4 = 1
            java.lang.String r5 = r5.getName()
            r0[r4] = r5
            java.lang.String r4 = "Given internalKeyMananger %s does not support primitive class %s"
            java.lang.String r4 = java.lang.String.format(r4, r0)
            r1.<init>(r4)
            throw r1
        L35:
            r3.f11589Z = r4
            r3.f11590a0 = r5
            return
    }

    public C2661hd(java.lang.String r2, p124h7.C2607ed r3) {
            r1 = this;
            r0 = 8
            r1.f11588Y = r0
            r1.<init>()
            r1.f11589Z = r2
            r1.f11590a0 = r3
            return
    }

    /* renamed from: g */
    public static p124h7.C2661hd m6803g(java.lang.String r3) {
            int r3 = p124h7.C2896ue.f11946a
            h7.sc r3 = new h7.sc
            java.lang.String r0 = "[.-]"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r3.<init>(r0)
            java.util.regex.Pattern r0 = r3.f11910Z
            java.lang.String r1 = ""
            java.util.regex.Matcher r0 = r0.matcher(r1)
            java.util.Objects.requireNonNull(r0)
            boolean r0 = r0.matches()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L2b
            h7.hd r0 = new h7.hd
            f.t r1 = new f.t
            r1.<init>(r3)
            r0.<init>(r1)
            return r0
        L2b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            java.lang.String r3 = "The pattern may not match the empty string: %s"
            java.lang.String r3 = p036c6.C0906q0.m2624l(r3, r1)
            r0.<init>(r3)
            throw r0
    }

    /* renamed from: a */
    public p124h7.C2690j6 m6804a(p124h7.AbstractC2574cg r5) {
            r4 = this;
            f.t r0 = r4.m6810j()     // Catch: p124h7.C2611f -> L58
            h7.x r5 = r0.m4781B(r5)     // Catch: p124h7.C2611f -> L58
            h7.h6 r0 = p124h7.C2690j6.m6854r()     // Catch: p124h7.C2611f -> L58
            h7.id<ResultT, CallbackT> r1 = r4.f11589Z     // Catch: p124h7.C2611f -> L58
            h7.s1 r1 = (p124h7.AbstractC2847s1) r1     // Catch: p124h7.C2611f -> L58
            java.lang.String r1 = r1.mo6566e()     // Catch: p124h7.C2611f -> L58
            boolean r2 = r0.f11974a0     // Catch: p124h7.C2611f -> L58
            r3 = 0
            if (r2 == 0) goto L1e
            r0.m7222d()     // Catch: p124h7.C2611f -> L58
            r0.f11974a0 = r3     // Catch: p124h7.C2611f -> L58
        L1e:
            MessageType extends h7.yg<MessageType, BuilderType> r2 = r0.f11973Z     // Catch: p124h7.C2611f -> L58
            h7.j6 r2 = (p124h7.C2690j6) r2     // Catch: p124h7.C2611f -> L58
            p124h7.C2690j6.m6857y(r2, r1)     // Catch: p124h7.C2611f -> L58
            h7.cg r5 = r5.mo7141m()     // Catch: p124h7.C2611f -> L58
            boolean r1 = r0.f11974a0     // Catch: p124h7.C2611f -> L58
            if (r1 == 0) goto L32
            r0.m7222d()     // Catch: p124h7.C2611f -> L58
            r0.f11974a0 = r3     // Catch: p124h7.C2611f -> L58
        L32:
            MessageType extends h7.yg<MessageType, BuilderType> r1 = r0.f11973Z     // Catch: p124h7.C2611f -> L58
            h7.j6 r1 = (p124h7.C2690j6) r1     // Catch: p124h7.C2611f -> L58
            p124h7.C2690j6.m6858z(r1, r5)     // Catch: p124h7.C2611f -> L58
            h7.id<ResultT, CallbackT> r5 = r4.f11589Z     // Catch: p124h7.C2611f -> L58
            h7.s1 r5 = (p124h7.AbstractC2847s1) r5     // Catch: p124h7.C2611f -> L58
            h7.i6 r5 = r5.mo6564b()     // Catch: p124h7.C2611f -> L58
            boolean r1 = r0.f11974a0     // Catch: p124h7.C2611f -> L58
            if (r1 == 0) goto L4a
            r0.m7222d()     // Catch: p124h7.C2611f -> L58
            r0.f11974a0 = r3     // Catch: p124h7.C2611f -> L58
        L4a:
            MessageType extends h7.yg<MessageType, BuilderType> r1 = r0.f11973Z     // Catch: p124h7.C2611f -> L58
            h7.j6 r1 = (p124h7.C2690j6) r1     // Catch: p124h7.C2611f -> L58
            p124h7.C2690j6.m6853A(r1, r5)     // Catch: p124h7.C2611f -> L58
            h7.yg r5 = r0.m7220b()     // Catch: p124h7.C2611f -> L58
            h7.j6 r5 = (p124h7.C2690j6) r5     // Catch: p124h7.C2611f -> L58
            return r5
        L58:
            r5 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Unexpected proto"
            r0.<init>(r1, r5)
            throw r0
    }

    @Override // p124h7.InterfaceC2697jd
    /* renamed from: b */
    public void mo28b(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.f11588Y
            r1 = 0
            switch(r0) {
                case 5: goto L1a;
                case 6: goto L8;
                default: goto L6;
            }
        L6:
            goto L91
        L8:
            h7.kf r12 = (p124h7.C2717kf) r12
            s7.j<ResultT> r0 = r11.f11590a0
            androidx.fragment.app.l0 r0 = (androidx.fragment.app.C0392l0) r0
            java.lang.Object r1 = r0.f2232b0
            f.t r1 = (p083f.C1933t) r1
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r0.f2231a0
            h7.fc r0 = (p124h7.C2624fc) r0
            p083f.C1933t.m4777E(r1, r12, r0, r11)
            return
        L1a:
            h7.pf r12 = (p124h7.C2807pf) r12
            java.lang.String r0 = r12.f11840c0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L5d
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r2 = 17025(0x4281, float:2.3857E-41)
            r3 = 0
            r0.<init>(r2, r3)
            s7.j<ResultT> r2 = r11.f11590a0
            androidx.fragment.app.l0 r2 = (androidx.fragment.app.C0392l0) r2
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r2 = r2.f2231a0
            h7.fc r2 = (p124h7.C2624fc) r2
            java.lang.String r7 = r12.f11841d0
            java.lang.String r9 = r12.f11840c0
            v9.v r12 = new v9.v
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 1
            r10 = 0
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            java.util.Objects.requireNonNull(r2)
            h7.pc r3 = r2.f11514a     // Catch: android.os.RemoteException -> L4c
            r3.mo6759o0(r0, r12)     // Catch: android.os.RemoteException -> L4c
            goto L90
        L4c:
            r12 = move-exception
            r6.a r0 = r2.f11515b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r0.f22479a
            java.lang.String r3 = "RemoteException when sending failure result."
            java.lang.String r0 = r0.m12162c(r3, r1)
            android.util.Log.e(r2, r0, r12)
            goto L90
        L5d:
            h7.me r4 = new h7.me
            java.lang.String r0 = r12.f11837Z
            java.lang.String r1 = r12.f11836Y
            long r2 = r12.f11838a0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "Bearer"
            r4.<init>(r0, r1, r2, r3)
            s7.j<ResultT> r0 = r11.f11590a0
            androidx.fragment.app.l0 r0 = (androidx.fragment.app.C0392l0) r0
            java.lang.Object r0 = r0.f2232b0
            r3 = r0
            f.t r3 = (p083f.C1933t) r3
            boolean r12 = r12.f11839b0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r12)
            s7.j<ResultT> r12 = r11.f11590a0
            androidx.fragment.app.l0 r12 = (androidx.fragment.app.C0392l0) r12
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r12 = r12.f2231a0
            r7 = r12
            h7.fc r7 = (p124h7.C2624fc) r7
            h7.id<ResultT, CallbackT> r12 = r11.f11589Z
            r8 = r12
            h7.jd r8 = (p124h7.InterfaceC2697jd) r8
            java.lang.String r5 = "phone"
            p083f.C1933t.m4776D(r3, r4, r5, r6, r7, r8)
        L90:
            return
        L91:
            java.lang.Void r12 = (java.lang.Void) r12
            s7.j<ResultT> r12 = r11.f11590a0
            h7.ab r12 = (p124h7.C2532ab) r12
            h7.fc r12 = r12.f11371Z
            java.util.Objects.requireNonNull(r12)
            h7.pc r0 = r12.f11514a     // Catch: android.os.RemoteException -> La2
            r0.mo6756e()     // Catch: android.os.RemoteException -> La2
            goto Lb2
        La2:
            r0 = move-exception
            r6.a r12 = r12.f11515b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r12.f22479a
            java.lang.String r3 = "RemoteException when sending delete account response."
            java.lang.String r12 = r12.m12162c(r3, r1)
            android.util.Log.e(r2, r12, r0)
        Lb2:
            return
    }

    /* renamed from: c */
    public java.lang.String m6805c(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            h7.id<ResultT, CallbackT> r0 = r6.f11589Z
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            int r2 = r7.length()
            java.lang.String r3 = java.lang.String.valueOf(r8)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 5
            int r1 = androidx.appcompat.widget.C0267d.m705a(r1, r5, r2, r3)
            r4.<init>(r1)
            r4.append(r0)
            r4.append(r7)
            java.lang.String r7 = "?key="
            r4.append(r7)
            r4.append(r8)
            java.lang.String r7 = r4.toString()
            return r7
    }

    /* renamed from: d */
    public void m6806d(ResultT r13, com.google.android.gms.common.api.Status r14) {
            r12 = this;
            s7.j<ResultT> r0 = r12.f11590a0
            s7.j r0 = (p327s7.C5986j) r0
            java.lang.String r1 = "completion source cannot be null"
            com.google.android.gms.common.internal.C1101a.m3104i(r0, r1)
            if (r14 == 0) goto L12e
            h7.id<ResultT, CallbackT> r13 = r12.f11589Z
            h7.id r13 = (p124h7.AbstractC2679id) r13
            h7.ya r0 = r13.f11638k
            if (r0 == 0) goto Ldd
            s7.j<ResultT> r14 = r12.f11590a0
            s7.j r14 = (p327s7.C5986j) r14
            o9.d r13 = r13.f11630c
            com.google.firebase.auth.FirebaseAuth r13 = com.google.firebase.auth.FirebaseAuth.getInstance(r13)
            h7.id<ResultT, CallbackT> r0 = r12.f11589Z
            h7.id r0 = (p124h7.AbstractC2679id) r0
            h7.ya r1 = r0.f11638k
            java.lang.String r0 = r0.mo6466b()
            java.lang.String r2 = "reauthenticateWithCredential"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L42
            h7.id<ResultT, CallbackT> r0 = r12.f11589Z
            h7.id r0 = (p124h7.AbstractC2679id) r0
            java.lang.String r0 = r0.mo6466b()
            java.lang.String r2 = "reauthenticateWithCredentialWithData"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L40
            goto L42
        L40:
            r0 = 0
            goto L48
        L42:
            h7.id<ResultT, CallbackT> r0 = r12.f11589Z
            h7.id r0 = (p124h7.AbstractC2679id) r0
            v9.o r0 = r0.f11631d
        L48:
            android.util.SparseArray<android.util.Pair<java.lang.String, java.lang.String>> r2 = p124h7.C2678ic.f11627a
            java.util.Objects.requireNonNull(r13)
            java.util.Objects.requireNonNull(r1)
            android.util.SparseArray<android.util.Pair<java.lang.String, java.lang.String>> r2 = p124h7.C2678ic.f11627a
            r3 = 17078(0x42b6, float:2.3931E-41)
            java.lang.Object r2 = r2.get(r3)
            android.util.Pair r2 = (android.util.Pair) r2
            v9.l r3 = new v9.l
            java.lang.Object r4 = r2.first
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.second
            java.lang.String r2 = (java.lang.String) r2
            java.util.List<h7.oe> r5 = r1.f12036Z
            java.util.List r5 = p185k7.C3828h5.m8585N(r5)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.util.Iterator r5 = r5.iterator()
        L75:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L8b
            java.lang.Object r6 = r5.next()
            v9.s r6 = (p375v9.AbstractC6621s) r6
            boolean r8 = r6 instanceof p375v9.C6625w
            if (r8 == 0) goto L75
            v9.w r6 = (p375v9.C6625w) r6
            r7.add(r6)
            goto L75
        L8b:
            java.util.List<h7.oe> r5 = r1.f12036Z
            java.util.List r5 = p185k7.C3828h5.m8585N(r5)
            java.lang.String r6 = r1.f12035Y
            com.google.android.gms.common.internal.C1101a.m3100e(r6)
            x9.g r8 = new x9.g
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r8.f27277a0 = r9
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.util.Iterator r5 = r5.iterator()
        La8:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto Lc0
            java.lang.Object r9 = r5.next()
            v9.s r9 = (p375v9.AbstractC6621s) r9
            boolean r10 = r9 instanceof p375v9.C6625w
            if (r10 == 0) goto La8
            java.util.List<v9.w> r10 = r8.f27277a0
            v9.w r9 = (p375v9.C6625w) r9
            r10.add(r9)
            goto La8
        Lc0:
            r8.f27276Z = r6
            x9.e r5 = new x9.e
            o9.d r13 = r13.f6579a
            r13.m11497a()
            java.lang.String r9 = r13.f20313b
            v9.j0 r10 = r1.f12037a0
            r11 = r0
            x9.f0 r11 = (p411x9.C6985f0) r11
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            r3.<init>(r4, r2, r5)
            s7.q<TResult> r13 = r14.f23075a
            r13.m12472q(r3)
            return
        Ldd:
            v9.c r13 = r13.f11637j
            if (r13 == 0) goto L120
            s7.j<ResultT> r13 = r12.f11590a0
            s7.j r13 = (p327s7.C5986j) r13
            android.util.SparseArray<android.util.Pair<java.lang.String, java.lang.String>> r0 = p124h7.C2678ic.f11627a
            int r0 = r14.f5536Z
            r1 = 17012(0x4274, float:2.3839E-41)
            if (r0 == r1) goto Lfb
            r1 = 17007(0x426f, float:2.3832E-41)
            if (r0 == r1) goto Lfb
            r1 = 17025(0x4281, float:2.3857E-41)
            if (r0 != r1) goto Lf6
            goto Lfb
        Lf6:
            o9.e r14 = p124h7.C2678ic.m6827a(r14)
            goto L11a
        Lfb:
            android.util.SparseArray<android.util.Pair<java.lang.String, java.lang.String>> r1 = p124h7.C2678ic.f11627a
            java.lang.Object r1 = r1.get(r0)
            android.util.Pair r1 = (android.util.Pair) r1
            if (r1 == 0) goto L10a
            java.lang.Object r1 = r1.second
            java.lang.String r1 = (java.lang.String) r1
            goto L10c
        L10a:
            java.lang.String r1 = "An internal error has occurred."
        L10c:
            java.lang.String r14 = p124h7.C2678ic.m6829c(r1, r14)
            v9.m r1 = new v9.m
            java.lang.String r0 = p124h7.C2678ic.m6828b(r0)
            r1.<init>(r0, r14)
            r14 = r1
        L11a:
            s7.q<TResult> r13 = r13.f23075a
            r13.m12472q(r14)
            return
        L120:
            s7.j<ResultT> r13 = r12.f11590a0
            s7.j r13 = (p327s7.C5986j) r13
            o9.e r14 = p124h7.C2678ic.m6827a(r14)
            s7.q<TResult> r13 = r13.f23075a
            r13.m12472q(r14)
            return
        L12e:
            s7.j<ResultT> r14 = r12.f11590a0
            s7.j r14 = (p327s7.C5986j) r14
            s7.q<TResult> r14 = r14.f23075a
            r14.m12473r(r13)
            return
    }

    @Override // p124h7.InterfaceC2697jd
    /* renamed from: e */
    public void mo29e(java.lang.String r2) {
            r1 = this;
            int r0 = r1.f11588Y
            switch(r0) {
                case 5: goto Le;
                case 6: goto L6;
                default: goto L5;
            }
        L5:
            goto L16
        L6:
            h7.id<ResultT, CallbackT> r0 = r1.f11589Z
            h7.jd r0 = (p124h7.InterfaceC2697jd) r0
            r0.mo29e(r2)
            return
        Le:
            h7.id<ResultT, CallbackT> r0 = r1.f11589Z
            h7.jd r0 = (p124h7.InterfaceC2697jd) r0
            r0.mo29e(r2)
            return
        L16:
            h7.id<ResultT, CallbackT> r0 = r1.f11589Z
            h7.jd r0 = (p124h7.InterfaceC2697jd) r0
            r0.mo29e(r2)
            return
    }

    /* renamed from: f */
    public p124h7.InterfaceC2935x m6807f(p124h7.AbstractC2574cg r5) {
            r4 = this;
            f.t r0 = r4.m6810j()     // Catch: p124h7.C2611f -> L9
            h7.x r5 = r0.m4781B(r5)     // Catch: p124h7.C2611f -> L9
            return r5
        L9:
            r5 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            h7.id<ResultT, CallbackT> r1 = r4.f11589Z
            h7.s1 r1 = (p124h7.AbstractC2847s1) r1
            v0.c r1 = r1.mo6563a()
            java.lang.Object r1 = r1.f25150a
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "Failures parsing proto of type "
            int r3 = r1.length()
            if (r3 == 0) goto L29
            java.lang.String r1 = r2.concat(r1)
            goto L2e
        L29:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
        L2e:
            r0.<init>(r1, r5)
            throw r0
    }

    /* renamed from: h */
    public byte[] m6808h() {
            r9 = this;
            r0 = 0
            r1 = 1
            h7.id<ResultT, CallbackT> r2 = r9.f11589Z     // Catch: java.lang.Throwable -> L6d
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch: java.lang.Throwable -> L6d
            s7.j<ResultT> r3 = r9.f11590a0     // Catch: java.lang.Throwable -> L6d
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L6d
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L59
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L6d
            int r3 = r3 % 2
            if (r3 != 0) goto L51
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L6d
            int r3 = r3 / 2
            byte[] r4 = new byte[r3]     // Catch: java.lang.Throwable -> L6d
            r5 = 0
        L22:
            if (r5 >= r3) goto L50
            int r6 = r5 + r5
            char r7 = r2.charAt(r6)     // Catch: java.lang.Throwable -> L6d
            r8 = 16
            int r7 = java.lang.Character.digit(r7, r8)     // Catch: java.lang.Throwable -> L6d
            int r6 = r6 + 1
            char r6 = r2.charAt(r6)     // Catch: java.lang.Throwable -> L6d
            int r6 = java.lang.Character.digit(r6, r8)     // Catch: java.lang.Throwable -> L6d
            r8 = -1
            if (r7 == r8) goto L48
            if (r6 == r8) goto L48
            int r7 = r7 * 16
            int r7 = r7 + r6
            byte r6 = (byte) r7     // Catch: java.lang.Throwable -> L6d
            r4[r5] = r6     // Catch: java.lang.Throwable -> L6d
            int r5 = r5 + 1
            goto L22
        L48:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L6d
            java.lang.String r3 = "input is not hexadecimal"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L6d
            throw r2     // Catch: java.lang.Throwable -> L6d
        L50:
            return r4
        L51:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L6d
            java.lang.String r3 = "Expected a string of even length"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L6d
            throw r2     // Catch: java.lang.Throwable -> L6d
        L59:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L6d
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L6d
            s7.j<ResultT> r4 = r9.f11590a0     // Catch: java.lang.Throwable -> L6d
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L6d
            r3[r0] = r4     // Catch: java.lang.Throwable -> L6d
            java.lang.String r4 = "can't read keyset; the pref value %s does not exist"
            java.lang.String r3 = java.lang.String.format(r4, r3)     // Catch: java.lang.Throwable -> L6d
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L6d
            throw r2     // Catch: java.lang.Throwable -> L6d
        L6d:
            java.io.CharConversionException r2 = new java.io.CharConversionException
            java.lang.Object[] r1 = new java.lang.Object[r1]
            s7.j<ResultT> r3 = r9.f11590a0
            java.lang.String r3 = (java.lang.String) r3
            r1[r0] = r3
            java.lang.String r0 = "can't read keyset; the pref value %s is not a valid hex string"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: i */
    public java.util.List<java.lang.String> m6809i(java.lang.CharSequence r3) {
            r2 = this;
            java.util.Objects.requireNonNull(r3)
            s7.j<ResultT> r0 = r2.f11590a0
            h7.j1 r0 = (p124h7.InterfaceC2685j1) r0
            java.util.Iterator r3 = r0.mo4788p(r2, r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L10:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.add(r1)
            goto L10
        L20:
            java.util.List r3 = java.util.Collections.unmodifiableList(r0)
            return r3
    }

    /* renamed from: j */
    public p083f.C1933t m6810j() {
            r2 = this;
            f.t r0 = new f.t
            h7.id<ResultT, CallbackT> r1 = r2.f11589Z
            h7.s1 r1 = (p124h7.AbstractC2847s1) r1
            v0.c r1 = r1.mo6563a()
            r0.<init>(r1)
            return r0
    }

    /* JADX WARN: Incorrect types in method signature: (TKeyProtoT;)TPrimitiveT; */
    /* renamed from: k */
    public java.lang.Object m6811k(p124h7.InterfaceC2935x r3) {
            r2 = this;
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            s7.j<ResultT> r1 = r2.f11590a0
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            h7.id<ResultT, CallbackT> r0 = r2.f11589Z
            h7.s1 r0 = (p124h7.AbstractC2847s1) r0
            r0.mo6567g(r3)
            h7.id<ResultT, CallbackT> r0 = r2.f11589Z
            h7.s1 r0 = (p124h7.AbstractC2847s1) r0
            s7.j<ResultT> r1 = r2.f11590a0
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Object r3 = r0.m7120d(r3, r1)
            return r3
        L20:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Cannot create a primitive for Void"
            r3.<init>(r0)
            throw r3
    }
}
