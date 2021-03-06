﻿// Copyright 2020 Maintainers of NUKE.
// Distributed under the MIT License.
// https://github.com/nuke-build/nuke/blob/master/LICENSE

using System;
using System.Linq;
using Nuke.Common.Tools.GitVersion;
using static Nuke.Common.ValueInjection.ValueInjectionUtility;

namespace Nuke.Components
{
    public interface IHazGitVersion
    {
        [GitVersion]
        GitVersion Versioning => TryGetValue(() => Versioning);
    }
}
