package p248o6;

import android.os.IInterface;

/* renamed from: o6.h */
/* loaded from: classes.dex */
public abstract class AbstractC4910h<T extends android.os.IInterface> extends p248o6.AbstractC4900c<T> implements p201l6.C4181a.e {

    /* renamed from: x0 */
    public final java.util.Set<com.google.android.gms.common.api.Scope> f19494x0;

    /* renamed from: y0 */
    public final android.accounts.Account f19495y0;

    public AbstractC4910h(@androidx.annotation.RecentlyNonNull android.content.Context r10, @androidx.annotation.RecentlyNonNull android.os.Looper r11, int r12, @androidx.annotation.RecentlyNonNull p248o6.C4902d r13, @androidx.annotation.RecentlyNonNull p218m6.InterfaceC4391d r14, @androidx.annotation.RecentlyNonNull p218m6.InterfaceC4395h r15) {
            r9 = this;
            o6.i r3 = p248o6.AbstractC4912i.m11066a(r10)
            java.lang.Object r0 = p184k6.C3702e.f16404c
            k6.e r4 = p184k6.C3702e.f16405d
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r14, r0)
            java.util.Objects.requireNonNull(r15, r0)
            o6.x r6 = new o6.x
            r6.<init>(r14)
            o6.y r7 = new o6.y
            r7.<init>(r15)
            java.lang.String r8 = r13.f19463f
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            android.accounts.Account r10 = r13.f19458a
            r9.f19495y0 = r10
            java.util.Set<com.google.android.gms.common.api.Scope> r10 = r13.f19460c
            java.util.Iterator r11 = r10.iterator()
        L2d:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L48
            java.lang.Object r12 = r11.next()
            com.google.android.gms.common.api.Scope r12 = (com.google.android.gms.common.api.Scope) r12
            boolean r12 = r10.contains(r12)
            if (r12 == 0) goto L40
            goto L2d
        L40:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Expanding scopes is not permitted, use implied scopes instead"
            r10.<init>(r11)
            throw r10
        L48:
            r9.f19494x0 = r10
            return
    }

    @Override // p201l6.C4181a.e
    /* renamed from: b */
    public java.util.Set<com.google.android.gms.common.api.Scope> mo9315b() {
            r1 = this;
            boolean r0 = r1.mo9323o()
            if (r0 == 0) goto L9
            java.util.Set<com.google.android.gms.common.api.Scope> r0 = r1.f19494x0
            return r0
        L9:
            java.util.Set r0 = java.util.Collections.emptySet()
            return r0
    }

    @Override // p248o6.AbstractC4900c
    @androidx.annotation.RecentlyNullable
    /* renamed from: t */
    public final android.accounts.Account mo11051t() {
            r1 = this;
            android.accounts.Account r0 = r1.f19495y0
            return r0
    }

    @Override // p248o6.AbstractC4900c
    @androidx.annotation.RecentlyNonNull
    /* renamed from: x */
    public final java.util.Set<com.google.android.gms.common.api.Scope> mo11052x() {
            r1 = this;
            java.util.Set<com.google.android.gms.common.api.Scope> r0 = r1.f19494x0
            return r0
    }
}
