package p185k7;

/* renamed from: k7.o4 */
/* loaded from: classes.dex */
public abstract class AbstractC3921o4<T> {

    /* renamed from: f */
    public static final java.lang.Object f16797f = null;

    /* renamed from: g */
    public static volatile p185k7.AbstractC3908n4 f16798g;

    /* renamed from: h */
    public static final java.util.concurrent.atomic.AtomicInteger f16799h = null;

    /* renamed from: a */
    public final p185k7.C3895m4 f16800a;

    /* renamed from: b */
    public final java.lang.String f16801b;

    /* renamed from: c */
    public final T f16802c;

    /* renamed from: d */
    public volatile int f16803d;

    /* renamed from: e */
    public volatile T f16804e;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p185k7.AbstractC3921o4.f16797f = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            p185k7.AbstractC3921o4.f16799h = r0
            return
    }

    public /* synthetic */ AbstractC3921o4(p185k7.C3895m4 r2, java.lang.String r3, java.lang.Object r4) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f16803d = r0
            android.net.Uri r0 = r2.f16743a
            if (r0 == 0) goto L11
            r1.f16800a = r2
            r1.f16801b = r3
            r1.f16802c = r4
            return
        L11:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Must pass a valid SharedPreferences file name or ContentProvider URI"
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: a */
    public abstract T mo8660a(java.lang.Object r1);

    /* renamed from: b */
    public final T m8860b() {
            r7 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = p185k7.AbstractC3921o4.f16799h
            int r0 = r0.get()
            int r1 = r7.f16803d
            if (r1 >= r0) goto L13e
            monitor-enter(r7)
            int r1 = r7.f16803d     // Catch: java.lang.Throwable -> L8c
            if (r1 >= r0) goto L13a
            k7.n4 r1 = p185k7.AbstractC3921o4.f16798g     // Catch: java.lang.Throwable -> L8c
            java.lang.String r2 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto L134
            k7.m4 r2 = r7.f16800a     // Catch: java.lang.Throwable -> L8c
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Throwable -> L8c
            android.content.Context r2 = r1.mo8840a()     // Catch: java.lang.Throwable -> L8c
            k7.d4 r2 = p185k7.C3771d4.m8487a(r2)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r3 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            java.lang.String r2 = r2.m8488b(r3)     // Catch: java.lang.Throwable -> L8c
            r3 = 0
            if (r2 == 0) goto L62
            java.util.regex.Pattern r4 = p185k7.C3998u3.f16879b     // Catch: java.lang.Throwable -> L8c
            java.util.regex.Matcher r2 = r4.matcher(r2)     // Catch: java.lang.Throwable -> L8c
            boolean r2 = r2.matches()     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L62
            java.lang.String r2 = "PhenotypeFlag"
            r4 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r4)     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L60
            java.lang.String r2 = "PhenotypeFlag"
            java.lang.String r4 = "Bypass reading Phenotype values for flag: "
            java.lang.String r5 = r7.m8861c()     // Catch: java.lang.Throwable -> L8c
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L8c
            int r6 = r5.length()     // Catch: java.lang.Throwable -> L8c
            if (r6 == 0) goto L57
            java.lang.String r4 = r4.concat(r5)     // Catch: java.lang.Throwable -> L8c
            goto L5d
        L57:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L8c
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L8c
            r4 = r5
        L5d:
            android.util.Log.d(r2, r4)     // Catch: java.lang.Throwable -> L8c
        L60:
            r2 = r3
            goto Lae
        L62:
            k7.m4 r2 = r7.f16800a     // Catch: java.lang.Throwable -> L8c
            android.net.Uri r2 = r2.f16743a     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L91
            android.content.Context r2 = r1.mo8840a()     // Catch: java.lang.Throwable -> L8c
            k7.m4 r4 = r7.f16800a     // Catch: java.lang.Throwable -> L8c
            android.net.Uri r4 = r4.f16743a     // Catch: java.lang.Throwable -> L8c
            boolean r2 = p185k7.C3799f4.m8530a(r2, r4)     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L8f
            k7.m4 r2 = r7.f16800a     // Catch: java.lang.Throwable -> L8c
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Throwable -> L8c
            android.content.Context r2 = r1.mo8840a()     // Catch: java.lang.Throwable -> L8c
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L8c
            k7.m4 r4 = r7.f16800a     // Catch: java.lang.Throwable -> L8c
            android.net.Uri r4 = r4.f16743a     // Catch: java.lang.Throwable -> L8c
            k7.y3 r2 = p185k7.C4050y3.m9150a(r2, r4)     // Catch: java.lang.Throwable -> L8c
            goto L9e
        L8c:
            r0 = move-exception
            goto L13c
        L8f:
            r2 = r3
            goto L9e
        L91:
            android.content.Context r2 = r1.mo8840a()     // Catch: java.lang.Throwable -> L8c
            k7.m4 r4 = r7.f16800a     // Catch: java.lang.Throwable -> L8c
            java.util.Objects.requireNonNull(r4)     // Catch: java.lang.Throwable -> L8c
            k7.p4 r2 = p185k7.C3934p4.m8877a(r2, r3)     // Catch: java.lang.Throwable -> L8c
        L9e:
            if (r2 == 0) goto L60
            java.lang.String r4 = r7.m8861c()     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r2 = r2.mo8224f(r4)     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L60
            java.lang.Object r2 = r7.mo8660a(r2)     // Catch: java.lang.Throwable -> L8c
        Lae:
            if (r2 == 0) goto Lb1
            goto Ld9
        Lb1:
            k7.m4 r2 = r7.f16800a     // Catch: java.lang.Throwable -> L8c
            boolean r2 = r2.f16744b     // Catch: java.lang.Throwable -> L8c
            if (r2 != 0) goto Ld4
            android.content.Context r2 = r1.mo8840a()     // Catch: java.lang.Throwable -> L8c
            k7.d4 r2 = p185k7.C3771d4.m8487a(r2)     // Catch: java.lang.Throwable -> L8c
            k7.m4 r4 = r7.f16800a     // Catch: java.lang.Throwable -> L8c
            boolean r4 = r4.f16744b     // Catch: java.lang.Throwable -> L8c
            if (r4 == 0) goto Lc7
            r4 = r3
            goto Lc9
        Lc7:
            java.lang.String r4 = r7.f16801b     // Catch: java.lang.Throwable -> L8c
        Lc9:
            java.lang.String r2 = r2.m8488b(r4)     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto Ld4
            java.lang.Object r2 = r7.mo8660a(r2)     // Catch: java.lang.Throwable -> L8c
            goto Ld5
        Ld4:
            r2 = r3
        Ld5:
            if (r2 != 0) goto Ld9
            T r2 = r7.f16802c     // Catch: java.lang.Throwable -> L8c
        Ld9:
            k7.t4 r1 = r1.mo8841b()     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r1 = r1.mo8217a()     // Catch: java.lang.Throwable -> L8c
            k7.r4 r1 = (p185k7.AbstractC3960r4) r1     // Catch: java.lang.Throwable -> L8c
            boolean r4 = r1.mo8908b()     // Catch: java.lang.Throwable -> L8c
            if (r4 == 0) goto L12f
            java.lang.Object r1 = r1.mo8907a()     // Catch: java.lang.Throwable -> L8c
            k7.e4 r1 = (p185k7.C3785e4) r1     // Catch: java.lang.Throwable -> L8c
            k7.m4 r2 = r7.f16800a     // Catch: java.lang.Throwable -> L8c
            android.net.Uri r2 = r2.f16743a     // Catch: java.lang.Throwable -> L8c
            java.lang.String r4 = r7.f16801b     // Catch: java.lang.Throwable -> L8c
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L126
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L8c
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r1 = r1.f16612a     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L8c
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L8c
            if (r1 != 0) goto L109
            goto L126
        L109:
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r3 = ""
            int r4 = r2.length()     // Catch: java.lang.Throwable -> L8c
            if (r4 == 0) goto L11a
            java.lang.String r2 = r3.concat(r2)     // Catch: java.lang.Throwable -> L8c
            goto L11f
        L11a:
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L8c
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8c
        L11f:
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L8c
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L8c
        L126:
            if (r3 != 0) goto L12b
            T r2 = r7.f16802c     // Catch: java.lang.Throwable -> L8c
            goto L12f
        L12b:
            java.lang.Object r2 = r7.mo8660a(r3)     // Catch: java.lang.Throwable -> L8c
        L12f:
            r7.f16804e = r2     // Catch: java.lang.Throwable -> L8c
            r7.f16803d = r0     // Catch: java.lang.Throwable -> L8c
            goto L13a
        L134:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8c
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L8c
            throw r0     // Catch: java.lang.Throwable -> L8c
        L13a:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L8c
            goto L13e
        L13c:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L8c
            throw r0
        L13e:
            T r0 = r7.f16804e
            return r0
    }

    /* renamed from: c */
    public final java.lang.String m8861c() {
            r1 = this;
            k7.m4 r0 = r1.f16800a
            java.util.Objects.requireNonNull(r0)
            java.lang.String r0 = r1.f16801b
            return r0
    }
}
