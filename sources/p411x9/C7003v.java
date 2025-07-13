package p411x9;

/* renamed from: x9.v */
/* loaded from: classes.dex */
public final class C7003v {

    /* renamed from: b */
    public static final p411x9.C7003v f27299b = null;

    /* renamed from: a */
    public final p411x9.C6997p f27300a;

    static {
            x9.v r0 = new x9.v
            r0.<init>()
            p411x9.C7003v.f27299b = r0
            return
    }

    public C7003v() {
            r2 = this;
            x9.p r0 = p411x9.C6997p.f27291b
            x9.k r1 = p411x9.C6992k.f27286a
            if (r1 != 0) goto Ld
            x9.k r1 = new x9.k
            r1.<init>()
            p411x9.C6992k.f27286a = r1
        Ld:
            r2.<init>()
            r2.f27300a = r0
            return
    }

    /* renamed from: a */
    public final void m14149a(android.content.Context r3) {
            r2 = this;
            x9.p r0 = r2.f27300a
            java.util.Objects.requireNonNull(r0)
            java.lang.String r0 = "com.google.firebase.auth.internal.ProcessDeathHelper"
            r1 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r1)
            p411x9.C6997p.m14146a(r3)
            return
    }

    /* renamed from: b */
    public final void m14150b(android.content.Context r3, com.google.android.gms.common.api.Status r4) {
            r2 = this;
            java.lang.String r0 = "com.google.firebase.auth.internal.ProcessDeathHelper"
            r1 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r1)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            int r0 = r4.f5536Z
            java.lang.String r1 = "statusCode"
            r3.putInt(r1, r0)
            java.lang.String r4 = r4.f5537a0
            java.lang.String r0 = "statusMessage"
            r3.putString(r0, r4)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = "timestamp"
            r3.putLong(r4, r0)
            r3.commit()
            return
    }
}
