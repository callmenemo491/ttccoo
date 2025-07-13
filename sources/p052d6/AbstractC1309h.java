package p052d6;

/* renamed from: d6.h */
/* loaded from: classes.dex */
public abstract class AbstractC1309h {

    /* renamed from: a */
    public final android.content.Context f6840a;

    /* renamed from: b */
    public final java.lang.String f6841b;

    /* renamed from: c */
    public final p052d6.BinderC1296a0 f6842c;

    public AbstractC1309h(@androidx.annotation.RecentlyNonNull android.content.Context r2, @androidx.annotation.RecentlyNonNull java.lang.String r3) {
            r1 = this;
            r1.<init>()
            d6.a0 r0 = new d6.a0
            r0.<init>(r1)
            r1.f6842c = r0
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r2, r0)
            android.content.Context r2 = r2.getApplicationContext()
            r1.f6840a = r2
            com.google.android.gms.common.internal.C1101a.m3100e(r3)
            r1.f6841b = r3
            return
    }

    @androidx.annotation.RecentlyNullable
    /* renamed from: a */
    public abstract p052d6.AbstractC1303e mo3797a(@androidx.annotation.RecentlyNonNull java.lang.String r1);

    /* renamed from: b */
    public abstract boolean mo3798b();
}
