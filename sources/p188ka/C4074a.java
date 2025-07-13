package p188ka;

/* renamed from: ka.a */
/* loaded from: classes.dex */
public class C4074a implements p327s7.InterfaceC5984h<java.lang.Void, java.lang.Void> {

    /* renamed from: Y */
    public final /* synthetic */ p188ka.C4075b f16993Y;

    public C4074a(p188ka.C4075b r1) {
            r0 = this;
            r0.f16993Y = r1
            r0.<init>()
            return
    }

    @Override // p327s7.InterfaceC5984h
    /* renamed from: k */
    public p327s7.AbstractC5985i<java.lang.Void> mo3892k(java.lang.Void r9) {
            r8 = this;
            java.lang.Void r9 = (java.lang.Void) r9
            java.lang.String r9 = "FirebaseCrashlytics"
            ka.b r0 = r8.f16993Y
            androidx.fragment.app.l0 r1 = r0.f16999f
            la.e r0 = r0.f16995b
            java.util.Objects.requireNonNull(r1)
            r2 = 0
            java.util.Map r3 = r1.m1245C(r0)     // Catch: java.io.IOException -> L57
            ha.a r4 = r1.m1277l(r3)     // Catch: java.io.IOException -> L57
            ha.a r0 = r1.m1273h(r4, r0)     // Catch: java.io.IOException -> L57
            java.lang.Object r4 = r1.f2232b0     // Catch: java.io.IOException -> L57
            aa.c r4 = (p011aa.C0047c) r4     // Catch: java.io.IOException -> L57
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L57
            r5.<init>()     // Catch: java.io.IOException -> L57
            java.lang.String r6 = "Requesting settings from "
            r5.append(r6)     // Catch: java.io.IOException -> L57
            java.util.ArrayList<androidx.fragment.app.n> r6 = r1.f2230Z     // Catch: java.io.IOException -> L57
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.io.IOException -> L57
            r5.append(r6)     // Catch: java.io.IOException -> L57
            java.lang.String r5 = r5.toString()     // Catch: java.io.IOException -> L57
            r4.m51b(r5)     // Catch: java.io.IOException -> L57
            java.lang.Object r4 = r1.f2232b0     // Catch: java.io.IOException -> L57
            aa.c r4 = (p011aa.C0047c) r4     // Catch: java.io.IOException -> L57
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L57
            r5.<init>()     // Catch: java.io.IOException -> L57
            java.lang.String r6 = "Settings query params were: "
            r5.append(r6)     // Catch: java.io.IOException -> L57
            r5.append(r3)     // Catch: java.io.IOException -> L57
            java.lang.String r3 = r5.toString()     // Catch: java.io.IOException -> L57
            r4.m53d(r3)     // Catch: java.io.IOException -> L57
            ha.b r0 = r0.m7365b()     // Catch: java.io.IOException -> L57
            org.json.JSONObject r0 = r1.m1246D(r0)     // Catch: java.io.IOException -> L57
            goto L69
        L57:
            r0 = move-exception
            java.lang.Object r1 = r1.f2232b0
            aa.c r1 = (p011aa.C0047c) r1
            r3 = 6
            boolean r1 = r1.m50a(r3)
            if (r1 == 0) goto L68
            java.lang.String r1 = "Settings request failed."
            android.util.Log.e(r9, r1, r0)
        L68:
            r0 = r2
        L69:
            if (r0 == 0) goto L103
            ka.b r1 = r8.f16993Y
            h7.rb r1 = r1.f16996c
            la.d r1 = r1.m7095q(r0)
            ka.b r3 = r8.f16993Y
            k7.h4 r3 = r3.f16998e
            long r4 = r1.f17397d
            java.util.Objects.requireNonNull(r3)
            java.lang.String r6 = "Failed to close settings writer."
            r7 = 2
            boolean r7 = android.util.Log.isLoggable(r9, r7)
            if (r7 == 0) goto L8a
            java.lang.String r7 = "Writing settings to cache file..."
            android.util.Log.v(r9, r7, r2)
        L8a:
            java.lang.String r7 = "expires_at"
            r0.put(r7, r4)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            java.io.FileWriter r4 = new java.io.FileWriter     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            java.io.File r3 = r3.m8569c()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            r4.<init>(r3)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La5
            r4.write(r3)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La5
            r4.flush()     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La5
            goto Lb0
        La3:
            r9 = move-exception
            goto Lff
        La5:
            r3 = move-exception
            goto Lab
        La7:
            r9 = move-exception
            goto Lfe
        La9:
            r3 = move-exception
            r4 = r2
        Lab:
            java.lang.String r5 = "Failed to cache settings"
            android.util.Log.e(r9, r5, r3)     // Catch: java.lang.Throwable -> Lfc
        Lb0:
            p056da.C1354e.m3857a(r4, r6)
            ka.b r9 = r8.f16993Y
            java.lang.String r3 = "Loaded settings: "
            r9.m9172c(r0, r3)
            ka.b r9 = r8.f16993Y
            la.e r0 = r9.f16995b
            java.lang.Object r0 = r0.f17403f
            java.lang.String r0 = (java.lang.String) r0
            android.content.Context r9 = r9.f16994a
            android.content.SharedPreferences r9 = p056da.C1354e.m3864h(r9)
            android.content.SharedPreferences$Editor r9 = r9.edit()
            java.lang.String r3 = "existing_instance_identifier"
            r9.putString(r3, r0)
            r9.apply()
            ka.b r9 = r8.f16993Y
            java.util.concurrent.atomic.AtomicReference<la.c> r9 = r9.f17001h
            r9.set(r1)
            ka.b r9 = r8.f16993Y
            java.util.concurrent.atomic.AtomicReference<s7.j<la.a>> r9 = r9.f17002i
            java.lang.Object r9 = r9.get()
            s7.j r9 = (p327s7.C5986j) r9
            la.a r0 = r1.f17394a
            r9.m12459b(r0)
            s7.j r9 = new s7.j
            r9.<init>()
            la.a r0 = r1.f17394a
            r9.m12459b(r0)
            ka.b r0 = r8.f16993Y
            java.util.concurrent.atomic.AtomicReference<s7.j<la.a>> r0 = r0.f17002i
            r0.set(r9)
            goto L103
        Lfc:
            r9 = move-exception
            r2 = r4
        Lfe:
            r4 = r2
        Lff:
            p056da.C1354e.m3857a(r4, r6)
            throw r9
        L103:
            s7.i r9 = p327s7.C5988l.m12464e(r2)
            return r9
    }
}
