package p375v9;

/* renamed from: v9.c0 */
/* loaded from: classes.dex */
public final class C6591c0 implements android.os.Parcelable.Creator<p375v9.C6624v> {
    public C6591c0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p375v9.C6624v createFromParcel(android.os.Parcel r12) {
            r11 = this;
            int r0 = p270p6.C5368b.m11710t(r12)
            r1 = 0
            r2 = 0
            r4 = r2
            r5 = r4
            r7 = r5
            r9 = r7
            r10 = r9
            r6 = 0
            r8 = 0
        Ld:
            int r1 = r12.dataPosition()
            if (r1 >= r0) goto L4c
            int r1 = r12.readInt()
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            switch(r2) {
                case 1: goto L46;
                case 2: goto L40;
                case 3: goto L3a;
                case 4: goto L34;
                case 5: goto L2e;
                case 6: goto L28;
                case 7: goto L22;
                default: goto L1e;
            }
        L1e:
            p270p6.C5368b.m11709s(r12, r1)
            goto Ld
        L22:
            java.lang.String r1 = p270p6.C5368b.m11695e(r12, r1)
            r10 = r1
            goto Ld
        L28:
            java.lang.String r1 = p270p6.C5368b.m11695e(r12, r1)
            r9 = r1
            goto Ld
        L2e:
            boolean r1 = p270p6.C5368b.m11700j(r12, r1)
            r8 = r1
            goto Ld
        L34:
            java.lang.String r1 = p270p6.C5368b.m11695e(r12, r1)
            r7 = r1
            goto Ld
        L3a:
            boolean r1 = p270p6.C5368b.m11700j(r12, r1)
            r6 = r1
            goto Ld
        L40:
            java.lang.String r1 = p270p6.C5368b.m11695e(r12, r1)
            r5 = r1
            goto Ld
        L46:
            java.lang.String r1 = p270p6.C5368b.m11695e(r12, r1)
            r4 = r1
            goto Ld
        L4c:
            p270p6.C5368b.m11699i(r12, r0)
            v9.v r12 = new v9.v
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r12
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p375v9.C6624v[] newArray(int r1) {
            r0 = this;
            v9.v[] r1 = new p375v9.C6624v[r1]
            return r1
    }
}
